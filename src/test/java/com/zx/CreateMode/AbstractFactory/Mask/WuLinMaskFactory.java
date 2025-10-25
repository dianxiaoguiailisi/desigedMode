package com.zx.CreateMode.AbstractFactory.Mask;

import com.zx.CreateMode.AbstractFactory.Car.abstractCar;
import com.zx.CreateMode.AbstractFactory.WuLinFactory;

public abstract class WuLinMaskFactory extends WuLinFactory {
    @Override
    public abstractCar newCar() {
        return null;
    }

    @Override
    public abstract  AbstractMask newMask();
}
