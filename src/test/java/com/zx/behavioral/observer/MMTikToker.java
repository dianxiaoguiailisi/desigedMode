package com.zx.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MMTikToker extends AbstractTikToker {
    /**
     * 维护所有感兴趣的人
     */
    List<AbstractFans> fansList = new ArrayList<>();

    public void startSell(){
        System.out.println("主播。。。。。开始卖货。。。。");
        notifyFans("我要开始卖东西了：源码设计课程");
    }
    public void endSell(){
        System.out.println("主播。。。。结束卖货。。。。");
        notifyFans("课程卖完了。。。。记得五星好评。。。。");
    }
    @Override
    void addFans(AbstractFans fans) {
        fansList.add(fans);
    }

    /**
     * 通知粉丝
     * @param msg
     */
    @Override
    void notifyFans(String msg) {
        for (AbstractFans fans : fansList) {//遍历所有粉丝
            fans.acceptMsg(msg);
        }
    }

    @Override
    void AddNotifyFans(String msg) {
        System.out.println("主播的粉丝增加了"+msg);
    }
}
