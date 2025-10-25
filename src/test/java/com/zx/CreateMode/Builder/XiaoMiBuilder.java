package com.zx.CreateMode.Builder;

public class XiaoMiBuilder extends AbstractBuilder{

    public XiaoMiBuilder(){
        phone =new Phone();
    }
    @Override
    public AbstractBuilder customCpu(String cpu) {
        phone.setCpu(cpu);
        return this;
    }

    @Override
    public AbstractBuilder customMem(String mem) {
        phone.setMem(mem);
        return this;
    }

    @Override
     public AbstractBuilder customDisk(String disk) {
        phone.setDisk(disk);
        return this;
    }

    @Override
    public AbstractBuilder customCam(String cam) {
        phone.setCam(cam);
        return this;
    }
}
