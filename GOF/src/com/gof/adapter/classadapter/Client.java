package com.gof.adapter.classadapter;

public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        //phone.charging(new VoltageClassAdapter());
        phone.charging(new VoltageObjAdapter(new Voltage220VAdaptee()));
    }
}
