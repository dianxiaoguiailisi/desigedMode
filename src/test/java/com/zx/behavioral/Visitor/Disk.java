package com.zx.behavioral.Visitor;

public class Disk extends Hardware{
    public Disk(String command){
        super(command);
    }

    @Override
    public void work() {
        System.out.println("Disk work"+command);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.VisitDisk(this);
    }
}
