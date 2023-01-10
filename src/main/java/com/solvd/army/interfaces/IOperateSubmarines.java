package com.solvd.army.interfaces;

public interface IOperateSubmarines {
    double minSpeed = 0.0;
    double maxSpeed = 100.0;

    void diving(String direction);
    void radar(boolean isTurnOn, int findObject, int scan);
}
