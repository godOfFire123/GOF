package com.glong.factory.simpleFactory.operation;
public class OprationClient {

    public static void main(String[] args) {
        CommOperation operation = null;
        operation = OperationFactory.createOperation("+");
        operation.setNumberA(1);
        operation.setNumberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
