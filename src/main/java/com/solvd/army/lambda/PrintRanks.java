package com.solvd.army.lambda;

import com.solvd.army.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class PrintRanks {
    private static Logger logger = LogManager.getLogger(Runner.class.getName());
    String ranks[] = {"General", "Colonel", "General", "IntelligenceTeam", "Lieutenant", "Major", "Doctor",
            "Nurse", "Operator", "Sergeant", "Soldiers"};

    public void display(){
        Arrays.asList(this.ranks).forEach((ranks) -> logger.info(ranks));
    }
}