package com.gof.observer;

/**
 * 核心类
 * 1.包含最新的天气情况信息
 * 2.含有CurrentConditions对象
 * 3.当数据有更新时，就主动的调用 CurrentConditions对象update方法，使接入方能看到最新的信息
 */
public class WeatherData {
    /**
     * 温度，气压，湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;



    //加入自己的网站
    private CurrentConditions currentConditions;
    //也可以加入第三方网站
    //---------
    private BaiduWebsite baiduWebsite;

    public WeatherData(CurrentConditions currentConditions, BaiduWebsite baiduWebsite){
        this.currentConditions = currentConditions;
        this.baiduWebsite = baiduWebsite;
    }



    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //将最新信息推送给 接入方
        this.dataChange();
    }

    public void dataChange(){
        //调用接入方的update
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
        baiduWebsite.update(getTemperature(), getPressure(), getHumidity());
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
