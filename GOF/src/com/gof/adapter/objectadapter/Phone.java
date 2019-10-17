package com.gof.adapter.objectadapter;

/**
 * 客户端
 */
public class Phone {

    public void charging(IVoltage5VTarget iVoltage5VTarget){
        if (iVoltage5VTarget.outprint5v() == 5){
            System.out.println("正在冲电.....");
        }else {
            System.out.println("电压不稳定 XXX");
        }
    }


}
