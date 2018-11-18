package joe.core.filter;

/**
 * @author : Joe
 * @version V1.0
 * @Project: basic
 * @Package joe.core.filter
 * @note: HttpServletRequest filter的顺序
 * @date Date : 2018年09月03日 11:57
 */
public interface FilterOrder {

    int REMOTE_IP = 9;
    int REPEATABLE = 10;
    int ASYNC = 11;
}
