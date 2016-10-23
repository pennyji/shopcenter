package com.cheer.mini.base.util;

import org.apache.log4j.Logger;

public class LogUtil {

    /**
     * info: 记录消息提示级别的日志
     * 
     */
    public static void info(Class<?> clazz, String message) {
        Logger.getLogger(clazz).info(message);
    }

    /**
     * debug: 记录调试级别日志
     * 
     */
    public static void debug(Class<?> clazz, String message) {
        Logger.getLogger(clazz).debug(message);
    }

    /**
     * 记录错误级别日志
     * 
     * @param clazz
     * @param message
     */
    public static void error(Class<?> clazz, String message) {
        Logger.getLogger(clazz).error(message);
    }
}
