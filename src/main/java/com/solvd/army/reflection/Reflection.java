package com.solvd.army.reflection;

import com.solvd.army.Runner;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import java.lang.reflect.*;
import java.util.logging.Logger;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, SecurityException, IllegalArgumentException  {
        java.util.logging.Logger logger = Logger.getLogger(Runner.class.getName());

        Class armyClass = Class.forName("com.solvd.army.position.Captain");

        Field[] fields = armyClass.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            String fieldName = field.getName();
            logger.info(fieldType + " " + fieldName);
        }

        Constructor[] constructors = armyClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            String constructorName = constructor.getName();
            logger.info(constructorName);
        }

        Method[] methods = armyClass.getDeclaredMethods();
        for (Method method : methods) {
            Class returnType = method.getReturnType();
            String methodName = method.getName();
            logger.info(returnType + " " + methodName);
        }
    }
}
