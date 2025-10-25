package com.zx.behavioral.state;

public class BeafNodleState implements TeamState {
    @Override
    public void playGame() {
        System.out.println("饱饱的吃一顿牛肉面......");
    }

    @Override
    public TeamState next() {
        return new MatchState();
    }
}
