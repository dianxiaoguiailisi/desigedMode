package com.zx.behavioral.Visitor;

public class XiaoAi {

    private CPU cpu = new CPU("武汉天气");
    private Disk disk =new Disk("武汉天气");

    public void answerQuestion(){
        cpu.work();
        disk.work();
    }

    public void acceptUpdate(Visitor visitor){
        //访问模式
        visitor.visitCPU(cpu);

        visitor.VisitDisk(disk);
    }
}
