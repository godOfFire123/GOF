package com.gof.observer.improve;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    //温度
    private float temperature;

    //湿度
    private float humidity;

    //气压
    private float pressure;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("------当前公告板A------");
        System.out.println("***气象站 气温:" + temperature + "***");
        System.out.println("***气象站 气压:" + pressure + "***");
        System.out.println("***气象站 湿度:" + humidity + "***");
    }

    /**
     * 当update()调用时，把观察值保存起来，然后调用display()
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
