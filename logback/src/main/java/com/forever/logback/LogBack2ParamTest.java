package com.forever.logback;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author: Forever丶诺
 * @date: 2018/6/19 11:53
 */
@Slf4j
public class LogBack2ParamTest {

    /**
     * 直接拼接字符串
     */
    @Test
    public void test1() {
        Integer age1 = 1;
        log.info("张三年龄:"+age1);
    }

    /**
     * 占位符
     */
    @Test
    public void test2() {
        Integer age1 = 1;
        log.info("张三年龄:{}",age1);
    }

    /**
     * 多个占位符
     */
    @Test
    public void test3() {
        Integer age1 = 1;
        Integer age2 = 2;
        log.info("张三年龄:{},王五年龄:{}",age1,age2);
    }

}
