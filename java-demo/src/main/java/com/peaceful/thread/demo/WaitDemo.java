package com.peaceful.thread.demo;

import com.peaceful.common.util.Util;

/**
 * @author WangJun <wangjuntytl@163.com>
 * @version 1.0 15/9/6
 * @since 1.6
 */

public class WaitDemo {


    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();
        Worker worker = new Worker(5000,lock);
        worker.start();
        worker.join(500);
        Util.report("main exec , get lock ");
        synchronized (lock) {
            // 必须获得锁才可以调用
            lock.notify();
        }

    }

    static class Worker extends Thread {

        private long wait;
        private Object lock;

        public Worker(long wait,Object lock) {
            this.wait = wait;
            this.lock = lock;
        }


        @Override
        public void run() {
            synchronized (lock) {
                try {
                    lock.wait(wait);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Util.report("worker complete");
            }
        }
    }
}
