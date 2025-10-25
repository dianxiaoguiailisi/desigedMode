package com.zx.CreateMode.AbstractFactory.Car;

public class VanCar extends abstractCar {
    public VanCar() { this.engine = "柴油发动机";}
    @Override
    public void run() {
        System.out.println(engine+"==>哒哒哒......");
    }
}
