package com.gof.observer.improve;

import java.util.ArrayList;

/**
 * 核心类
 */
public class WeatherData implements Subject {

    //温度
    private float temperature;

    //湿度
    private float humidity;

    //气压
    private float pressure;

    private ArrayList observers;

    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * 注册观察者
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        int n = observers.indexOf(observer);
        if (n > 0){
            observers.remove(observer);
        }
    }

    /**
     * 通知每一个观察者，因为每一位观察者都实现了update()
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当从气象站得到更新观测值时，通知观察者
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    /**
     * 设置观测值
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
