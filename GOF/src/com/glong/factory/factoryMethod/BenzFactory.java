package com.glong.factory.factoryMethod;

import com.glong.factory.simpleFactory.car.BenzCar;
import com.glong.factory.simpleFactory.car.Car;

/**
 *
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BenzCar();
    }
}
