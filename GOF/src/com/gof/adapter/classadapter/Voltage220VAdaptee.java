package com.gof.adapter.classadapter;

/**
 * 被适配的类(源角色)
 */
public class Voltage220VAdaptee {

    public int output220V(){
        int src = 220 ;
        System.out.println("电压 = "+src +"伏");
        return src ;
    }
}
