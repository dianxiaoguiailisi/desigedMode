package com.zx.StructureMode.flyweight;

public abstract class AbstractWaitressFlyweight {
    boolean canServiceState = true;
    //正在服务，享元的不可共享属性留给外部进行改变的接口
    public abstract  void service();
    //服务完成 享元的不可共享属性留给外部进行改变的接口
    public abstract  void end();

    public boolean isCanServiceState() {
                return canServiceState;
    }
}
