package com.solvd.army;

import com.solvd.army.threads.Command;
import com.solvd.army.threads.SuppliesNeeded;
import com.solvd.army.country.Ally;
import com.solvd.army.country.Enemy;
import com.solvd.army.exceptions.NoNameException;
import com.solvd.army.linkedlist.LinkedList;
import com.solvd.army.weapon.WarProduction;
import com.solvd.army.country.Country;
import com.solvd.army.country.CountryTerritory;
import com.solvd.army.position.*;

import org.apache.logging.log4j.*;

import java.util.Scanner;

public class Runner {
    private static Logger logger = LogManager.getLogger(Runner.class.getName());
    public final static void main(String[] args){

        new Thread(new Command()).start();
        new SuppliesNeeded().start();

        General newGeneral = new General("Eric","Liu",49,19,30000);
        try{
            Captain newCaptain = new Captain("Aaron","Zhang",27,5,150);
        } catch (NoNameException e){
            logger.info("No name or Invalid name");
        }
        try{
            Colonel newColonel = new Colonel("Mason","Zoe",35,9,2000);
        } catch (NoNameException e){
            logger.info("No name or Invalid name");
        }

        LinkedList<String> ranks = new LinkedList<String>();
        ranks.add("Captain"); ranks.add("Colonel"); ranks.add("General"); ranks.add("Intelligence Team");
        ranks.add("Lieutenant"); ranks.add("Major"); ranks.add("Medical Doctor"); ranks.add("Medical Nurse");
        ranks.add("Sergeant"); ranks.add("Soldier");

        CountryTerritory newTerritory = new CountryTerritory("East Coast", "The Bears", 1000000);
        Country CountryA = new Country("United Bears","Catholic", "Democrat",1350000000, 2401, 3000000);

        WarProduction newProduction = new WarProduction(15, 30,2,3500,10000,12000,6000);

        CountryTerritory newAllyTerritory = new CountryTerritory("West Coast", "TROSS", 1350000);
        CountryTerritory newEnemyTerritory = new CountryTerritory("Latin America", "The Larry", 645000);
        Ally newAlly = new Ally("The Republic of Bananas", "No Religion", "Republican", 350000000, 1340, 1500000, newAllyTerritory);
        Enemy newEnemy = new Enemy("The Larry of States","Buddism","Democrat",1200000000,2990, 3500000,newEnemyTerritory);
    }
}
