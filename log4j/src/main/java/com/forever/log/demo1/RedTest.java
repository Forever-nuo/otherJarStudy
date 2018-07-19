package com.forever.log.demo1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: Forever丶诺
 * @date: 2018/7/19 14:10
 */
@Slf4j
public class RedTest {

    public static void main(String[] args) {
        while(true){
            log.trace("输出trace级别的信息");
            log.debug("输出debug级别的信息");
            log.info("输出info级别的信息");
            log.warn("输出warn级别的信息");
            log.error("输出error级别的信息");
        }

    }


}
