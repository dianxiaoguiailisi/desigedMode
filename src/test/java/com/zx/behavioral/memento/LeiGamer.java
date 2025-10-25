package com.zx.behavioral.memento;

import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

/**
 * 游戏者：游戏发起人
 * 当前游戏信息
 */
@Data
public class LeiGamer {
    Integer coin;//剩余金币
    Integer hp;//血量
    Integer mp;//蓝量
    //以上是内部状态
    Boolean flag = false;

    GameServer gameServer = new GameServer();
    //保存游戏记录
   public void saveGameRecord() throws Exception {
        System.out.println("正在保存当前记录。。。。"+"coin:"+coin+" hp:"+hp+"  mp:"+mp);
       GameRecord gameRecord = new GameRecord();
       //当前游戏信息保存到备忘录
       BeanUtils.copyProperties(gameRecord,this);
       gameServer.add(gameRecord);
    }
    //从备忘录获取游戏历史存档
    public LeiGamer getFromMemento(Integer id) throws Exception {
        System.out.println("获取历史存档信息。。。。。。"+"coin:"+coin+" hp:"+hp+"  mp:"+mp);
        LeiGamer record = gameServer.getRecord(id);
        flag = true;
        return record;
    }
    //玩游戏
    public void playGame(){
        System.out.println("..........((^_^))。。。。。。");
        System.out.println(flag);
        if (!flag){//没有恢复信息
            int i  = new Random().nextInt(100);
            coin = i;
            hp= 100-i;
            mp = hp+coin%100;
            flag = false;
            System.out.println("coin:"+coin+" hp:"+hp+"  mp:"+mp);
        }else if (flag){
            System.out.println("==========");
            System.out.println("coin:"+coin+" hp:"+hp+"  mp:"+mp);

        }
        flag = false;

    }
    //退出游戏
    public void exitGame(){
        System.out.println("退出&存档");
    }
}
