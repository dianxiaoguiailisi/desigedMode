package com.zx.behavioral.Visitor;

public class UpdatePack implements Visitor {
    @Override
    public void VisitDisk(Disk disk) {
        disk.command=">>>>联网云存储";
    }

    @Override
    public void visitCPU(CPU cpu) {
        cpu.command =">>>>联网查询中";
        //装饰模式增强work
    }
}
