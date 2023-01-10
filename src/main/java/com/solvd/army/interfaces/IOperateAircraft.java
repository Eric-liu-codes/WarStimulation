package com.solvd.army.interfaces;

public interface IOperateAircraft {
    double minSpeed = 0.0;
    double maxSpeed = 2000.0;

    void moving(double speed, String direction);
    void firing(boolean isFiring);
}
