package com.zx.behavioral.observer;

public abstract class AbstractTikToker {
    //添加粉丝
    abstract void addFans(AbstractFans fans);
    //通知粉丝
    abstract void notifyFans(String msg);

    abstract void AddNotifyFans(String msg);
}
