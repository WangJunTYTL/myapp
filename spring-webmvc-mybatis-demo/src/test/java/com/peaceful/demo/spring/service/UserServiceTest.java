package com.peaceful.demo.spring.service;

import com.peaceful.common.util.Util;
import com.peaceful.demo.spring.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService userService;
    ApplicationContext applicationContext = null;

    @Before
    public void setUp() throws Exception {

        applicationContext = new ClassPathXmlApplicationContext(
                "classpath*:/spring/applicationContext*.xml");
        userService = applicationContext.getBean(UserService.class);

    }

    @Test
    public void testGetUserById() throws Exception {
        User user = userService.getUserById(165);
        if (user != null)
            Util.report(user.name);
    }

    // test for FactoryBean
    @Test
    public void testGetFactoryBeanDemo() {
        DBConn dbConn = (DBConn) applicationContext.getBean("factoryBeanDemo");
        dbConn.getConn();
        dbConn = (DBConn) applicationContext.getBean("factoryBeanDemo");
    }

    @Test
    public void testInsertUser() {
        User user = new User();
        user.setName("wjj");
        userService.insert(user);
    }

    @Test
    public void testInsert2User() {
        User user = new User();
        user.setName("wjj");
        userService.insert2(user);
    }

    @Test
    public void testQueryUser() {
        userService.queryUserById(1);
        userService.queryUserById(1);
    }

    @Test
    public void testDefaultBean() {
//        ApplicationContext applicationContext_ = applicationContext.getBean(ApplicationContext.class);
//        BeanFactory beanFactory = applicationContext.getBean(BeanFactory.class);
//        Util.report(applicationContext_);
//        Util.report(beanFactory);
        String[] names = applicationContext.getBeanNamesForType(UserService.class);
        Util.report(names);
    }

    @Test
    public void testQueryByName() {
        Util.report("result size ->" + userService.queryByName("w").size());
    }

    @Test
    public void queryUserById(){
        userService.queryUserById(1);
    }

}