package com.forever.logback;

import ch.qos.logback.classic.Level;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Forever丶诺
 * @date: 2018/6/19 11:32
 */

@Slf4j
public class Logback2And1Test {

    /**
     * q:设置的级别是info级别
     * p:打印的级别 p>q 才会输出
     * trace<debug<info<warn<error
     * 只会输出info<warn<error
     */
    @Test
    public void testLevel1() {
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) Logback2And1Test.log;
        logger.setLevel(Level.INFO);
        logger.trace("trace级别的输出");
        logger.debug("debug级别的输出");
        logger.info("info级别的输出");
        logger.warn("warn级别的输出");
        logger.error("error级别的输出");
    }


    @Test
    public void testLevel2() {
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) Logback2And1Test.log;
        logger.setLevel(Level.ERROR);
        logger.trace("trace级别的输出");
        logger.debug("debug级别的输出");
        logger.info("info级别的输出");
        logger.warn("warn级别的输出");
        logger.error("error级别的输出");
    }
}
