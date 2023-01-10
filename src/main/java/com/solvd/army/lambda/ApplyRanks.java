package com.solvd.army.lambda;
@FunctionalInterface
public interface ApplyRanks<T, R> {
    R apply(T temp);
}