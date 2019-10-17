package com.glong.factory.simpleFactory.operation;

/**
 * 加法运算类
 */
public class OperationAdd extends CommOperation {

    @Override
    public double getResult() {
        return super.getNumberA() + super.getNumberB();
    }
}
