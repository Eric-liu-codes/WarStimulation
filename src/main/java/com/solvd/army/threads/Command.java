package com.solvd.army.threads;

import com.solvd.army.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Command implements Runnable {
    private static Logger logger = LogManager.getLogger(Runner.class.getName());
    @Override
    public void run() {
        String soldierUnderCommand[] = {
                "Sergeant: 4 soldiers",
                "Lieutenant: 16-44 soldiers",
                "Captain: 60-200 soldiers",
                "Colonel: 1500-3200 soldiers",
                "Major: 10000-16000 soldiers",
                "General: 20000-40000 soldiers"
        };
        try{
            for(int i = 0; i < soldierUnderCommand.length; i++){
                Thread.sleep(1000);
                logger.info("%s: %s%n", Thread.currentThread().getName(), soldierUnderCommand[i]);
            }
        } catch (InterruptedException e) {
            logger.error("Thread not finished");
        }
    }
}
