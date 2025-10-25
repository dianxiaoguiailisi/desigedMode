package com.zx.CreateMode.AbstractFactory.Car.CarFactory;

import com.zx.CreateMode.AbstractFactory.Car.VanCar;
import com.zx.CreateMode.AbstractFactory.Car.WuLinCarFactory;
import com.zx.CreateMode.AbstractFactory.Car.abstractCar;


/**
 * 分厂造车
 */
public class WuLinVanCarFactory extends WuLinCarFactory {
    @Override
    public abstractCar newCar() {
        return new VanCar();
    }
}
