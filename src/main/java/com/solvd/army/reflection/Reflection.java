package com.solvd.army.reflection;

import com.solvd.army.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Modifier;

public class Reflection<T> {
    private static Logger logger = LogManager.getLogger(Runner.class.getName());
    private T army;
    Class armyRanks = Class.forName("com.solvd.army.position.ArmyRanks");
    String name = armyRanks.getName();
    int modifier = armyRanks.getModifiers();
    String convert = Modifier.toString(modifier);

    public Reflection() throws ClassNotFoundException {
    }
}
