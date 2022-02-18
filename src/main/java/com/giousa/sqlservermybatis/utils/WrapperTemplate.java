package com.giousa.sqlservermybatis.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Supplier;

@Slf4j
public class WrapperTemplate {

    public static <T> T execute(Supplier<T> supplier, Class clazz, String methodName, Object... request) {
        return execute(supplier, clazz, methodName, true, request);
    }

    public static <T> T execute(Supplier<T> supplier, Class clazz, String methodName, boolean printResult, Object... request) {
        try {
            T result = supplier.get();
            if (printResult) {
                log.info("execute.supplier. className: {}; methodName: {}; request: {}; result: {}", clazz, methodName, request, result);
            } else {
                log.info("execute.supplier. className: {}; methodName: {}; request: {}", clazz, methodName, request);
            }
            return result;
        } catch (Exception e) {
            log.warn("execute.supplier. className: {}; methodName: {}; request:{}; e: {}", clazz, methodName, request, e);
            return null;
        }
    }
}
