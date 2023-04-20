package com.peaceful.other;

import com.peaceful.Util;

/**
 * <a mailto:wangjuntytl@163.com>Email:wangjuntytl@163.com</a>
 *
 * @author wangjun
 * @version 1.0
 * @since 15/4/11.
 */

public class RecursionDemo {


    //递归与回溯
    public static void main(String[] args) {
        t1(0);
    }

    public static void t1(int x) {
        if (x >= 3) {
            Util.report(x);
        } else if (x < 3) {
            Util.report(x);
            t1(x + 1); //递归
            Util.report(x); //回溯
        }
    }
}
