package com.gof.singleton;
//饿汉式（静态常量）
public class Demo01 {
    //本类内部创建对象实例
    private final static Demo01 instance = new Demo01();
    //构造器私有化（防止外部new）
    private Demo01(){}
    //向外暴露一个静态的公共方法获取对象实例
    public static Demo01 getInstance(){
        return instance;
    }
}

class Client{
    public static void main(String[] args) {
        Demo01 instance = Demo01.getInstance();
        Demo01 instance1 = Demo01.getInstance();
        System.out.println(instance == instance1);//true
        System.out.println(instance.equals(instance1));//true
        System.out.println(instance.hashCode()+"=="+instance1.hashCode());//true
    }
}
