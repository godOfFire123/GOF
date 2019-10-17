package com.glong.factory.factoryMethod;

import com.glong.factory.simpleFactory.car.AudiCar;
import com.glong.factory.simpleFactory.car.Car;

/**
 *
 */
public class AudiFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new AudiCar();
    }
}
