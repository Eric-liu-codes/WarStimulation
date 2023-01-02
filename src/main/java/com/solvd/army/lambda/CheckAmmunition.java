package com.solvd.army.lambda;

import com.solvd.army.Runner;
import com.solvd.army.weapon.Gun;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Consumer;

public class CheckAmmunition<A extends Gun> {
    private static Logger logger = LogManager.getLogger(Runner.class.getName());
    private A status;
    private A low;
    private A high;
    Consumer<Integer> rounds = i -> {
        if(i <= 0){
            logger.info("No ammunition");
            status = low;
        }else{
            logger.info("Still have rounds left");
            status = high;
        }
    };
}
