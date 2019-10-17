package com.glong.factory.simpleFactory.operation02;

/**
 * 运算类 ： 可以获取结果
 */
public class Operation {

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

    //运算结果
    public double getResult(){
        return 0;
    }
}
