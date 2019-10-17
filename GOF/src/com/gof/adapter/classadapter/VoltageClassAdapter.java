package com.gof.adapter.classadapter;

/**
 * 类适配器
 * 适配器类(适配器角色)
 */
public class VoltageClassAdapter extends Voltage220VAdaptee implements IVoltage5V {
    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV / 44 ; //适配器转换
        return dstV;
    }
}
