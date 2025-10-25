package com.zx.CreateMode.AbstractFactory.Car;

public class RacingCar  extends abstractCar{
    public RacingCar(){ this.engine = "V8发动机";}
    @Override
    public void run() {
        System.out.println(engine+"===>嗖....");
    }
}
