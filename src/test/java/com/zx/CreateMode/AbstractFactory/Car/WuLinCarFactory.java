package com.zx.CreateMode.AbstractFactory.Car;

import com.zx.CreateMode.AbstractFactory.Mask.AbstractMask;
import com.zx.CreateMode.AbstractFactory.WuLinFactory;

/**
 * 汽车集团：
 */
public abstract class WuLinCarFactory extends WuLinFactory {
    @Override
    abstract public abstractCar newCar();

    @Override
    public AbstractMask newMask() {
        return null;
    }
}
