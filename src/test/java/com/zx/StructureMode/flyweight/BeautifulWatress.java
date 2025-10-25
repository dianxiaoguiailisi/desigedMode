package com.zx.StructureMode.flyweight;

import lombok.AllArgsConstructor;

/**
 * 具体享元类：
 */
@AllArgsConstructor
public class BeautifulWatress extends AbstractWaitressFlyweight{

    String id;
    String name;
    int age;
    //以上是不变的


    @Override
     public void service() {
        System.out.println("工号"+id+"; "+name+" "+age+"正在为你服务。。。");
        this.canServiceState = false;
    }

    @Override
     public void end() {
        System.out.println("工号"+id+"; "+name+" "+age+"结束服务。。。");
        this.canServiceState = true;
    }
}
