package com.gof.observer.improve;

/**
 * 主题接口
 */
public interface Subject {

    //注册观察者
    public void registerObserver(Observer observer);

    //删除观察者
    public void removeObserver(Observer observer);

    //当主题状态改变时，该方法调用，以通知所有的观察者
    public void notifyObservers();
}
