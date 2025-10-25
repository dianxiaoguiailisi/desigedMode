package com.zx.StructureMode.BridgeMode;

public class XiaoMiPhone extends  AbstractPhone{
    @Override
    public String getPhone() {
        return "小米："+sale.getSaleInfo();
    }
}
