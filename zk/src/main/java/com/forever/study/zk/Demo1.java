package com.forever.study.zk;

import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.junit.Test;

import java.io.IOException;

import static org.apache.zookeeper.CreateMode.PERSISTENT;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-29.23:23
 */
@Slf4j
public class Demo1 {

    /**
     * 连接客户端
     * @throws Exception
     */
    @Test
    public void testClient() throws Exception {
        ZooKeeper zk = new ZooKeeper("192.168.56.102,192.168.56.103,192.168.56.104", 30000, new Watcher() {
            public void process(WatchedEvent event) {
                log.warn(event.toString());
                log.warn(""+event.getType());
                log.warn(""+event.getState());
            }
        });
        zk.close();
    }


    /**
     * 创建节点
     * @throws Exception
     */
    @Test
    public void testCreateNode() throws Exception {
        ZooKeeper zk = new ZooKeeper("192.168.56.102,192.168.56.103,192.168.56.104", 30000, new Watcher() {
            public void process(WatchedEvent event) {
                log.warn(event.toString());
                log.warn(""+event.getType());
                log.warn(""+event.getState());
            }
        });
        zk.create("/java","java学习".getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,PERSISTENT);
        zk.close();
    }
}
