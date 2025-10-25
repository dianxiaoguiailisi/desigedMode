package com.zx.StructureMode.BridgeMode;

public class HuaWeiPhone extends AbstractPhone {
    @Override
    public String getPhone() {
        return "华为："+sale.getSaleInfo();
    }
}
