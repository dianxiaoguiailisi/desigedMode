package com.zx.behavioral.Visitor;

/**
 * 抽象元素类
 */
public abstract class Hardware {
    String command;

    public Hardware(String command){
        this.command = command;
    }
    //收到命令进行工作
    public abstract void work();
    //定义接受软件升级包的方法
    public abstract  void accept(Visitor visitor);
}
