package com.gof.adapter.objectadapter;

/**
 * 被适配者(源角色)
 */
public class Voltage220VAdaptee {

    public int  outprint220v(){
        System.out.println("目前电压为：220V");
        return 220;
    }
}
