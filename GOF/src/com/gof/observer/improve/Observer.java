package com.gof.observer.improve;

/**
 * 观察者接口
 * 所有的观察者都必须实现update()方法
 */
public interface Observer {

    //当气象观测值改变时，主题会把这些状态值当做方法的参数，传递给观察者
    public void update(float temp, float humidity, float pressure);

}
