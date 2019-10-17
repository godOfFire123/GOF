package com.gof.singleton;

//懒汉式（线程安全,同步方法）
public class Demo04 {

    //本类内部创建对象实例
    private static Demo04 instance;

    //构造器私有化（防止外部new）
    private Demo04(){}

    //向外暴露一个静态的公共方法获取对象实例,当使用到该方法时，才去创建instance
    public static synchronized Demo04 getInstance(){
        if (instance == null){
            instance = new Demo04();
        }
        return instance;
    }
}
class Client04{
    public static void main(String[] args) {
        Demo04 instance = Demo04.getInstance();
        Demo04 instance1 = Demo04.getInstance();
        System.out.println(instance == instance1);//true
        System.out.println(instance.equals(instance1));//true
        System.out.println(instance.hashCode()+"=="+instance1.hashCode());//true
    }
}
