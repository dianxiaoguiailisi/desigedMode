package com.zx.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFans {
    String FansName;
    //双向观察者
    List<AbstractTikToker> tikTokerList = new ArrayList<>();
    //粉丝收到主播
    abstract void acceptMsg(String msg);

    public void setFansName(String fansName) {
        FansName = fansName;
    }

    /**
     * 关注主播
     * @param tikToker
     */
    public void follow(AbstractTikToker tikToker) {
        //粉丝关注主播
        tikTokerList.add(tikToker);
        //主播增加粉丝
        tikToker.addFans(this);

        for (AbstractTikToker toker : tikTokerList) {
            toker.AddNotifyFans("哈哈哈哈我是粉丝："+FansName);
        }
    }
}
