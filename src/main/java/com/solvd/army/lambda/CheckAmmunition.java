package com.solvd.army.lambda;

@FunctionalInterface
public interface CheckAmmunition<T> {
    boolean emptyAmmunition(T ammunition);
}
