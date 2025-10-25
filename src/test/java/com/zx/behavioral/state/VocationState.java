package com.zx.behavioral.state;

public class VocationState implements TeamState {
    @Override
    public void playGame() {
        System.out.println("三亚旅游真舒服.....不完游戏。。。。。");
    }

    @Override
    public TeamState next() {
        return new BeafNodleState();
    }
}
