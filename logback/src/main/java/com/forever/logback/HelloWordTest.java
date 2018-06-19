package com.forever.logback;

import junit.extensions.TestSetup;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Forever丶诺
 * @date: 2018/6/19 10:18
 */
@Slf4j
public class HelloWordTest {

    /**
     * 获取logger对象
     */
    Logger logger = LoggerFactory.getLogger(HelloWordTest.class);

    @Test
    public void test() {
        logger.debug("打印信息");
    }

    @Test
    public void testLevel() {
        log.trace("trace级别的输出....");
        log.debug("debug级别的输出");
        log.info("info级别的输出");
        log.warn("warn级别的输出");
        log.error("error级别的输出");
    }
}
