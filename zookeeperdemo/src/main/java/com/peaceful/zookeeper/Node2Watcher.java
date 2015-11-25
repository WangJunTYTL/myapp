package com.peaceful.zookeeper;

import com.peaceful.common.util.Util;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

/**
 * Created by wangjun on 15/11/24.
 */
public class Node2Watcher implements Watcher {

    @Override
    public void process(WatchedEvent event) {
        Util.report("Node2Watcher:"+event);
    }
}
