package com.gof.proxy.staticproxy;


//目标对象
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课.....");
    }

}
