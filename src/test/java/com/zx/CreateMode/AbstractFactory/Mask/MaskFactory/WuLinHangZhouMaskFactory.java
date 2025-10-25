package com.zx.CreateMode.AbstractFactory.Mask.MaskFactory;

import com.zx.CreateMode.AbstractFactory.Mask.AbstractMask;
import com.zx.CreateMode.AbstractFactory.Mask.CommonMask;
import com.zx.CreateMode.AbstractFactory.Mask.WuLinMaskFactory;

public class WuLinHangZhouMaskFactory extends WuLinMaskFactory {
    @Override
    public AbstractMask newMask() {
        return new CommonMask();
    }
}
