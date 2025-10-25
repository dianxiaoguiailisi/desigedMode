package com.zx.behavioral.memento;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * 游戏管理者
 */
public class GameServer {
    //管理备忘录
    Map<Integer,GameRecord> records = new HashMap<Integer,GameRecord>();
    int i = 1;
     void add(GameRecord gameRecord) {
         gameRecord.setId(i++);
         records.put(gameRecord.id, gameRecord);
     }

     LeiGamer getRecord(Integer id) {
         GameRecord gameRecord = records.get(id);
         LeiGamer leiGamer = new LeiGamer();
         //获取备忘录里面的内容之后逆转(使用工具类bean)
         try {
             BeanUtils.copyProperties(leiGamer,gameRecord);
         } catch (Exception e) {
             throw new RuntimeException(e);
         }
         return leiGamer;
     }

}
