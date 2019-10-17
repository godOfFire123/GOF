package com.gof.observer.improve;

/**
 * c测试
 */
public class Client {

    public static void main(String[] args) {
        //建立WeatherData对象
        WeatherData weatherData = new WeatherData();

        //建立一个公告板对象
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        //其他公告板对象建立***

        //观测值发生改变
        weatherData.setMeasurements(80,35,30.4f);

    }
}
