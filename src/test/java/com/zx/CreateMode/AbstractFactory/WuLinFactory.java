package com.zx.CreateMode.AbstractFactory;

import com.zx.CreateMode.AbstractFactory.Car.abstractCar;
import com.zx.CreateMode.AbstractFactory.Mask.AbstractMask;

/**
 * 总工厂
 */
public abstract class WuLinFactory {
    public  abstract abstractCar newCar();
    public  abstract AbstractMask newMask();
}
