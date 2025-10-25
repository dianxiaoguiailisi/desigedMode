package com.zx.StructureMode.Proxy.statics;

/**
 * 代理一般和被代理的对象属于同一接口
 */
public class TiktokProxy implements ManTikTok{
    private  ManTikTok manTikTok;//被代理对象
    public TiktokProxy(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }
    @Override
    public void tiktok() {
        System.out.println("武汉分zx正在直播.....");
    }
}
