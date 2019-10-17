package com.glong.factory.simpleFactory.car;

/**
 * 简单工厂模式
 *      要点：
 *          -简单工厂模式也叫静态工厂模式，就是工厂类一般是是使用静态方法，
 *           通过接受参数的不同来返回不同的对象实例。
 *          -对于增加新产品无能为力！不修改代码的话，是无法扩展的。
 */
public class CarFactory {

    public static Car createCarInstance(String type){
        Car car = null;
        if ("奥迪".equals(type)){
             car = new AudiCar();
        }else if ("奔驰".equals(type)){
             car = new BenzCar();
        }
            return car;

    }
}
