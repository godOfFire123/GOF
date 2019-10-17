package com.gof.singleton;

//枚举
public class Demo08 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        instance.sayOK();
    }
}

//使用枚举，可以实现单例，推荐
enum Singleton{

    //属性
    INSTANCE;

    public void sayOK(){
        System.out.println("OK---");
    }
}
