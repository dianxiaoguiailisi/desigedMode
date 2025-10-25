package com.zx.behavioral.observer;

public class RobotFans extends AbstractFans {
    @Override
    void acceptMsg(String msg) {
        System.out.println("呸。。。。扔了");
    }
}
