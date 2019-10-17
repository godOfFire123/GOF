package com.gof.proxy;
//目标对象
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课.....");
    }

    @Override
    public void sayHello(String name) {
        System.out.println(name + ", Hello");
    }
}
