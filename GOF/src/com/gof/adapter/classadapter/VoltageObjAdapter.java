package com.gof.adapter.classadapter;

/**
 * 对象适配器
 * 适配器角色
 */
public class VoltageObjAdapter implements IVoltage5V{

    private Voltage220VAdaptee voltage220V;

    public VoltageObjAdapter(Voltage220VAdaptee voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int i220v = voltage220V.output220V();
        int i5v = i220v / 44 ;
        return i5v;
    }
}
