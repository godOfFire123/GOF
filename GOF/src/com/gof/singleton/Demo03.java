package com.gof.singleton;
//懒汉式（线程不安全）
public class Demo03 {

    //本类内部创建对象实例
    private static Demo03 instance;

    //构造器私有化（防止外部new）
    private Demo03(){}

    //向外暴露一个静态的公共方法获取对象实例,当使用到该方法时，才去创建instance
    public static Demo03 getInstance(){
        if (instance == null){
            instance = new Demo03();
        }
        return instance;
    }
}
class Client03{
    public static void main(String[] args) {
        Demo03 instance = Demo03.getInstance();
        Demo03 instance1 = Demo03.getInstance();
        System.out.println(instance == instance1);//true
        System.out.println(instance.equals(instance1));//true
        System.out.println(instance.hashCode()+"=="+instance1.hashCode());//true
    }
}
