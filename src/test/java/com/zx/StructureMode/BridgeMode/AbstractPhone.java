package com.zx.StructureMode.BridgeMode;

/**
 * 抽象手机类：手机有各种销售渠道价格都不一样
 */
public abstract class AbstractPhone {
    //真正会引起此类变化的一个纬度直接抽取出来，通过组合的方式桥接起来
    AbstractSale sale;//分离渠道「桥接的关注点」
    //abstract int getPrice();如果这么写需要许多实现

    /**
     * 当前手机的描述
     * @return
     */
    public abstract String getPhone();

    public void setSale(AbstractSale sale){
        this.sale = sale;
    }
}
