package com.forever.log.demo1;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author: Forever丶诺
 * @date: 2018/7/19 14:22
 */
@Slf4j
public class BlueTest {

    public static void main(String[] args) {
        log.info("输出信息1:{}",log.getName());
        log.info("输出信息2:{}",log.getName());
        log.info("输出信息3:{}",log.getName());
    }

}
