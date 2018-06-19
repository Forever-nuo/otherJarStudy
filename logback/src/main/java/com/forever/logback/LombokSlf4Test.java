package com.forever.logback;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.junit.Test;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;

/**
 * @author: Forever丶诺
 * @date: 2018/6/19 10:27
 */
@Slf4j
public class LombokSlf4Test {

    @Test
    public void test() {
        log.trace("trace级别的输出");
        log.info("使用lombok的注解方式创建logger"+log.getName());
    }

    /**
     * 打印记录器状态
     */
    @Test
    public void testLoggerContext() {
        LoggerContext context = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print(context);
    }

    @Test
    public void testPrintError() {
        int i = 1/0;
    }

    @Test
    public void testAllLevel() {
        log.trace("trace级别的输出");
        log.debug("debug级别的输出");
        log.info("info级别的输出");
        log.warn("warn级别的输出");
        log.error("error级别的输出");
    }

}
