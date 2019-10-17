package com.gof.proxy.staticproxy;


//代理对象（静态代理）
public class TeacherDaoProxy implements ITeacherDao {

    //目标对象，通过接口聚合
    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("代理开始，，完成某些操作...");
        iTeacherDao.teach();
        System.out.println("代理结束，，完成某些操作...");
    }

}
