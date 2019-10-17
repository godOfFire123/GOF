package com.gof.adapter.objectadapter;

/**
 * 适配器类
 */
public class VoltageObjeAdapter implements IVoltage5VTarget{

    private Voltage220VAdaptee voltage220VAdaptee;

    public VoltageObjeAdapter(Voltage220VAdaptee voltage220VAdaptee){
        this.voltage220VAdaptee = voltage220VAdaptee;
    }

    @Override
    public int outprint5v() {
        int src = voltage220VAdaptee.outprint220v();
        int desc = src / 44 ;
        return desc;
    }
}
