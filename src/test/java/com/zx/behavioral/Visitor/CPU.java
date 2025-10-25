package com.zx.behavioral.Visitor;

public class CPU extends Hardware{
    public CPU(String command){
        super(command);
    }

    @Override
    public void work() {
        System.out.println("CPU work"+command);
    }

    @Override
    public void accept(Visitor visitor) {
        //给升级包一个改CPU指令等信息的方法
        visitor.visitCPU(this);
    }
}
