package com.glong.factory.simpleFactory.operation;

/**
 * 公共的运算类
 */
public class CommOperation {

    private double numberA ;
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult(){
        return 0;
    }
}
