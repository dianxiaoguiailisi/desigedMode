package com.zx.CreateMode.AbstractFactory.Car.CarFactory;

import com.zx.CreateMode.AbstractFactory.Car.RacingCar;
import com.zx.CreateMode.AbstractFactory.Car.WuLinCarFactory;
import com.zx.CreateMode.AbstractFactory.Car.abstractCar;

/**
 * 分厂：造车
 */
public class WuLinRacingCarFactory extends WuLinCarFactory {
    @Override
    public abstractCar newCar() {
        return new RacingCar();
    }

}
