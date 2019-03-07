package joe.core.utils;

public class CollectionHelper {
    public <T> Map<String, T> listMap2Map(List<Map<String, Object>> list, String key, String value) {
        return list.parallelStream()
                .map(m -> Collections.singletonMap(m.get(key).toString(), (T) m.get(value)))
                .map(Map::entrySet)
                .flatMap(Set::stream)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public <T> Map<String, T> listMap2Map(List<Map<String, Object>> list, String key, Function<Map<String, Object>, T> valFun) {
        return list.parallelStream()
                .map(m -> Collections.singletonMap(m.get(key).toString(), valFun.apply(m)))
                .map(Map::entrySet)
                .flatMap(Set::stream)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
    
    public <K, V> Map<K, V> listMap2Map(List<Map<String, Object>> list, Function<Map<String, Object>, K> keyFun, Function<Map<String, Object>, V> valFun) {
        return list.parallelStream()
                .map(m -> Collections.singletonMap(keyFun.apply(m), valFun.apply(m)))
                .map(Map::entrySet)
                .flatMap(Set::stream)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}