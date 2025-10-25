package com.zx.StructureMode.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 足浴店：相当于享元工厂，店里有许多服务员
 */
public class ZuDao {
    private static Map<String, AbstractWaitressFlyweight> pool = new HashMap<>();

    //享元：池子里有对象
    static {
        BeautifulWatress waitress1 = new BeautifulWatress("1111", "沾恩", 18);
        BeautifulWatress waitress2 = new BeautifulWatress("1221", "哒哒哒", 18);
        pool.put(waitress1.id, waitress1);
        pool.put(waitress2.id, waitress2);
    }

    public void addWaitress(AbstractWaitressFlyweight waitress) {
        pool.put(UUID.randomUUID().toString(), waitress);
    }

    //从池子里拿服务元
    public static AbstractWaitressFlyweight getWaitress(String name) {
        AbstractWaitressFlyweight flyweight = pool.get(name);
        if (flyweight == null) {
            for (AbstractWaitressFlyweight value : pool.values()) {
                if (value.isCanServiceState())//当前共享对象能发使用
                    return value;
            }
            return null;
        }else  {
            return flyweight;
        }
    }

}
