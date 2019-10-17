package com.gof.observer;

public class Client {

    public static void main(String[] args) {

        //创建接入方(自己网站)
        CurrentConditions conditions = new CurrentConditions();

        //百度网站
        BaiduWebsite baiduWebsite = new BaiduWebsite();

        //创建WeatherData, 并将 接入方 传入
        WeatherData weatherData = new WeatherData(conditions,  baiduWebsite);

        //更新天气
        //weatherData.setData(30, 150, 40);

        //天气情况变化
        System.out.println("------------天气情况变化--------------");
        weatherData.setData(40, 160, 30);
    }
}
