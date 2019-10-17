package com.gof.singleton;

//双重检查
public class Demo06 {

    //本类内部创建对象实例
    private static volatile Demo06 singleton;

    //构造器私有化（防止外部new）
    private Demo06(){}

    //提供一个静态的公共方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题（保证了效率，推荐使用）
    public static synchronized Demo06 getInstance(){
        if (singleton == null){
            synchronized (Demo06.class){
                if (singleton == null){
                    singleton = new Demo06();
                }
            }
        }
        return singleton;
    }
}

class Client06{
    public static void main(String[] args) {
        Demo06 instance = Demo06.getInstance();
        Demo06 instance1 = Demo06.getInstance();
        System.out.println(instance == instance1);//true
        System.out.println(instance.equals(instance1));//true
        System.out.println(instance.hashCode()+"=="+instance1.hashCode());//true
    }
}
