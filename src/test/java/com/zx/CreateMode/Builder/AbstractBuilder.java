package com.zx.CreateMode.Builder;

public abstract class   AbstractBuilder {
    Phone phone ;
    public abstract AbstractBuilder customCpu(String cpu);

    public abstract AbstractBuilder customMem(String mem);

    public abstract AbstractBuilder customDisk(String disk);

    public abstract AbstractBuilder customCam(String cam);
    public Phone getProduct(){
        return phone;
    }
}
