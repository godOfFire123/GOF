package com.gof.observer;

/**
 * 显示当前天气情况(可以理解成气象站自己的网站)
 */
public class CurrentConditions {
    /**
     * 温度，气压，湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    /**
     * 显示天气
     */
    private void display() {
        System.out.println("=====气象网站=====");
        System.out.println("***气象站 气温:" + temperature + "***");
        System.out.println("***气象站 气压:" + pressure + "***");
        System.out.println("***气象站 湿度:" + humidity + "***");

    }
}
