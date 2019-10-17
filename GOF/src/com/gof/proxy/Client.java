package com.gof.proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao target = new TeacherDao();

        //方式1：给目标对象创建代理对象，可转为ITeacherDao
        //ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();

        //方式2：
        ITeacherDao proxyInstance = (ITeacherDao)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{ITeacherDao.class} , new ProxyFactory(target));

        proxyInstance.teach();
        proxyInstance.sayHello("zhilong...");
    }
}
