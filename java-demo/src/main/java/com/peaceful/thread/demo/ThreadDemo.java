package com.peaceful.thread.demo;

import com.peaceful.common.util.Util;

/**
 * @author WangJun <wangjuntytl@163.com>
 * @version 1.0 15/9/6
 * @since 1.6
 */

public class ThreadDemo {

    public static void main(String[] args) {

        Util.report("currentThread:" + Thread.currentThread().getName() + "\n"
                + "name:" + Thread.currentThread().getName()+"\n"
                + "priority:"+Thread.currentThread().getPriority()+"\n"
                + "state:"+Thread.currentThread().getState()+"\n"
                + "threadGroup:"+Thread.currentThread().getThreadGroup()+"\n"
        );
    }
}