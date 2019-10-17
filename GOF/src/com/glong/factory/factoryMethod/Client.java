package com.glong.factory.factoryMethod;
import com.glong.factory.simpleFactory.car.Car;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        Car adcar = new AudiFactory().createCar();
        Car bzcar = new BenzFactory().createCar();
        adcar.run();
        bzcar.run();
    }
}
