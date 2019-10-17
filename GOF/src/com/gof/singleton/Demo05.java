package com.gof.singleton;

//懒汉式（线程安全，同步代码块）
public class Demo05 {

    //本类内部创建对象实例
    private static Demo05 singleton;

    //构造器私有化（防止外部new）
    private Demo05(){}

    public static Demo05 getInstance(){
        if (singleton == null){
            synchronized (Demo05.class){
                singleton = new Demo05();
            }
        }
        return singleton;
    }
}

class Client05{
    public static void main(String[] args) {
        Demo05 instance = Demo05.getInstance();
        Demo05 instance1 = Demo05.getInstance();
        System.out.println(instance == instance1);//true
        System.out.println(instance.equals(instance1));//true
        System.out.println(instance.hashCode()+"=="+instance1.hashCode());//true
    }
}
