package com.zx.StructureMode.decorator;

/**
 * 美颜装饰器
 */
public class MeiYanDecorator implements TikTokDecorator {
    //被装饰的对象
    private ManTikTok manTikTok;
    public MeiYanDecorator(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }
    @Override
    public void tiktok() {
        //增强功能
        enableMeiYan();
        //原始功能
        manTikTok.tiktok();
    }

    /**
     * 增强功能
     */
    @Override
    public void enableMeiYan() {
        System.out.println("花花花花。。。。。");
    }
}
