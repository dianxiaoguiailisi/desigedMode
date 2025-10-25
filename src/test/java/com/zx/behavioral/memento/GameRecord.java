package com.zx.behavioral.memento;

import lombok.Data;

/**
 * 游戏记录：需要保存的内部状态信息
 */
@Data
public class GameRecord {

    Integer coin;//剩余金币
    Integer hp;//血量
    Integer mp;//蓝量
    //生成记录的id
    Integer id;

    void getCurrent(){
        System.out.println("coin:"+coin+"hp:"+hp+"mp:"+mp);
    }
}
