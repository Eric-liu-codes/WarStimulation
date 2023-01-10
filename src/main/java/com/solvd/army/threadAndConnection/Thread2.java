package com.solvd.army.threadAndConnection;

import com.solvd.army.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Thread2 extends Thread {
    private static Logger logger = LogManager.getLogger(Runner.class.getName());
    public void run(){
        String food = "Average 2 units a day";
        String camping = "Camping: Average 1 unit per month";
        String clothing = "Clothing: Average 1 unit every 2 weeks";
        String average[] = {food, camping, clothing};
        try{
            for(int i = 0; i < average.length; i++){
                Thread.sleep(2000);
                logger.info("%s: %s%n", Thread.currentThread().getName(), average[i]);
            }
        } catch (InterruptedException e) {
            logger.error("Thread not finished");
        }
    }
}
