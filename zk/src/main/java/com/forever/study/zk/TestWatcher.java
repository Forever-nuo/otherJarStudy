package com.forever.study.zk;

import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.junit.Test;

import java.io.IOException;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-30.12:22
 */
@Slf4j
public class TestWatcher {

    @Test
    public void test() throws Exception {
        ZooKeeper zk = new ZooKeeper("192.168.56.102,192.168.56.103,192.168.56.104", 30000, new Watcher() {
            public void process(WatchedEvent event) {
                log.warn(event.toString());
                log.warn(""+event.getType());
                log.warn(""+event.getState());
            }
        });
        zk.getData("/java",true,null);

        zk.setData("/java","java入门".getBytes(),-1);
    }


}
