package com.zx.behavioral.state;

/**
 * 抽象状态类
 */
public interface TeamState {

    void playGame();
    /*
    状态模式的核心：切换到下一个状态
     */
    TeamState next();
}
