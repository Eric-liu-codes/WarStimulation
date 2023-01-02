package com.solvd.army;

public interface IOperateTank {
    double minSpeed = 0.0;
    double maxSpeed = 70.0;

    void moving(double speed, String direction);
    void firing(boolean isFiring);
}
