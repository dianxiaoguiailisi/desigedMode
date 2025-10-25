package com.zx.CreateMode.AbstractFactory.Mask.MaskFactory;

import com.zx.CreateMode.AbstractFactory.Mask.AbstractMask;
import com.zx.CreateMode.AbstractFactory.Mask.N95Mask;
import com.zx.CreateMode.AbstractFactory.Mask.WuLinMaskFactory;

public class WuLinWuHanMaskFactory extends WuLinMaskFactory {
    @Override
    public AbstractMask newMask() {
        return new N95Mask();
    }
}
