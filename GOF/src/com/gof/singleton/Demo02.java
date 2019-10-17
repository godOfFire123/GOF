package com.gof.singleton;
//饿汉式（静态代码块）
public class Demo02 {
    //本类内部创建对象实例
    private static Demo02 instance;
    //在静态代码块中创建单例对象
    static {
        instance = new Demo02();
    }
    //构造器私有化（防止外部new）
    private Demo02 (){
    }
    //提供一个公有的静态方法，返回实例对象
    public static Demo02 getInstance(){
        return instance;
    }
}
class Client02{
    public static void main(String[] args) {
        Demo02 instance = Demo02.getInstance();
        Demo02 instance1 = Demo02.getInstance();
        System.out.println(instance == instance1);//true
        System.out.println(instance.equals(instance1));//true
        System.out.println(instance.hashCode()+"=="+instance1.hashCode());//true
    }
}
