package com.gof.singleton;

//静态内部类（推荐使用）
public class Demo07 {

    //本类内部创建对象实例
    private static volatile Demo07 instance;

    //构造器私有化
    private Demo07(){}

    //写一个静态内部类，该类中有一个静态属性
    private static class SigletonInstance{
        private static final Demo07 INSTANCE = new Demo07();
    }
    
    //提供一个静态的公有方法，直接返回SigletonInstance.INSTANCE
    public static synchronized Demo07 getInstance(){
        return SigletonInstance.INSTANCE;
    }
}

class Client07{
    public static void main(String[] args) {
        Demo07 instance = Demo07.getInstance();
        Demo07 instance1 = Demo07.getInstance();
        System.out.println(instance == instance1);//true
        System.out.println(instance.equals(instance1));//true
        System.out.println(instance.hashCode()+"=="+instance1.hashCode());//true
    }
}
