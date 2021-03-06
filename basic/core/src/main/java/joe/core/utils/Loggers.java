package joe.core.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 生成日志工具类
 *
 * @author : Joe joe_fs@sina.com
 * @version V1.0
 * Date : 2018年09月04日 10:21
 */
public class Loggers {
    public static Logger getLogger() {
        Throwable t = new Throwable();
        StackTraceElement directCaller = t.getStackTrace()[1];
        return LoggerFactory.getLogger(directCaller.getClassName());
    }
}
