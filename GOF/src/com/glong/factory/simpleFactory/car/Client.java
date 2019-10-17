package com.glong.factory.simpleFactory.car;

/**
 *
 */
public class Client {

    public static void main(String[] args) {
        Car carInstance = CarFactory.createCarInstance("奔驰");
        carInstance.run();
    }
}
