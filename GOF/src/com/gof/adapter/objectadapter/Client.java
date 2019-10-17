package com.gof.adapter.objectadapter;

public class Client {

    public static void main(String[] args) {

        //手机对象
        Phone phone = new Phone();
        //220源电压
        Voltage220VAdaptee voltage220VAdaptee = new Voltage220VAdaptee();
        //适配器（理解为一个充电器把220V电压进行转换）
        VoltageObjeAdapter voltageObjeAdapter = new VoltageObjeAdapter(voltage220VAdaptee);
        //手机冲电
        phone.charging(voltageObjeAdapter);
    }
}
