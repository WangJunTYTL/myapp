package com.peaceful.jdk.demo;

import com.peaceful.jdk.demo.impl.User;
import com.peaceful.util.Util;

/**
 * Date 14/11/15.
 * Author WangJun
 * Email wangjuntytl@163.com
 */
public class ClassTemo {

    //forName,加载指定路径的类文件，返回Class 对象，该过程会执行静态块的代码，slf4j使用这个绑定
    public void forName() {
        try {
            Class<User> sessionClass = (Class<User>) Class.forName("com.peaceful.jdk.demo.impl.UserImpl");
            Class[] classes = sessionClass.getInterfaces();
            User user = null;
            for (Class clazz : classes) {
                Util.report(clazz.getName());
                if (clazz.equals(User.class)) {
                    user = sessionClass.newInstance();
                    String currentUser = user.getCurrentUser();
                    Util.report(currentUser);
                }
            }
            if (user == null) {
                throw new RuntimeException("com.peaceful.jdk.demo.impl.UserImpl not implements  User interface  ");
            }
        } catch (ClassNotFoundException e) {
            Util.report(e);
        } catch (InstantiationException e) {
            Util.report(e);
        } catch (IllegalAccessException e) {
            Util.report(e);
        }
    }
}