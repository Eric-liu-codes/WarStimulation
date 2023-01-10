package com.solvd.army;

import com.solvd.army.lambda.ApplyRanks;
import com.solvd.army.lambda.CheckAmmunition;
import com.solvd.army.lambda.OfficialRanks;
import com.solvd.army.threadAndConnection.Connection;
import com.solvd.army.threadAndConnection.ConnectionPool;
import com.solvd.army.threadAndConnection.Thread1;
import com.solvd.army.threadAndConnection.Thread2;
import com.solvd.army.country.Ally;
import com.solvd.army.country.Enemy;
import com.solvd.army.exceptions.NoNameException;
import com.solvd.army.linkedlist.LinkedList;
import com.solvd.army.weapon.WarProduction;
import com.solvd.army.country.Country;
import com.solvd.army.country.CountryTerritory;
import com.solvd.army.position.*;

import org.apache.logging.log4j.*;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class Runner {
    private static Logger logger = LogManager.getLogger(Runner.class.getName());
    public final static void main(String[] args){

        new Thread(new Thread1()).start();
        new Thread2().start();

        General newGeneral = new General("Eric","Liu",49,19,30000);
        try{
            Captain newCaptain = new Captain("Aaron","Zhang",27,5,150);
        } catch (NoNameException e){
            logger.error("No name or Invalid name");
        }
        try{
            Colonel newColonel = new Colonel("Mason","Zoe",35,9,2000);
        } catch (NoNameException e){
            logger.error("No name or Invalid name");
        }

        //Demo for ApplyRanks functional interface
        ApplyRanks<String, Integer> applyFunction = s -> s.length();
        int length = applyFunction.apply("General");
        logger.info(length);

        //Demo for CheckAmmunition
        CheckAmmunition<String> stringEmptyFunction = s -> s.isEmpty();
        boolean isEmpty = stringEmptyFunction.emptyAmmunition("");
        logger.info(isEmpty);

        //Demo for OfficialRanks
        ArrayList<String> ranks = new ArrayList<>();
        ranks.add("Captain");
        ranks.add("Colonel");
        ranks.add("General");
        ranks.add("Lieutenant");
        ranks.add("Major");
        ranks.add("Sergeant");
        OfficialRanks printRanksFunction = r -> {
            for (Object rank : r) {
                logger.info(ranks);
            }
        };

        ConnectionPool connectionPool = ConnectionPool.getInstance();
        CompletableFuture<Connection> futureTemp = connectionPool.getConnection();

        LinkedList<String> armyRanks = new LinkedList<String>();
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
