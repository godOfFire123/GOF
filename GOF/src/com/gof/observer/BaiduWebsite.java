package com.gof.observer;

/**
 * 显示当前天气情况(百度的网站)
 */
public class BaiduWebsite {

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
        System.out.println("=====百度网站=====");
        System.out.println("***百度网站 气温:" + temperature + "***");
        System.out.println("***百度网站 气压:" + pressure + "***");
        System.out.println("***百度网站 湿度:" + humidity + "***");

    }
}
