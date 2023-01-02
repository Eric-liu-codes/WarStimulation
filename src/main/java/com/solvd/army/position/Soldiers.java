package com.solvd.army.position;
import com.solvd.army.IUseGun;
import com.solvd.army.Runner;
import org.apache.logging.log4j.*;
import java.util.Objects;

public class Soldiers extends ArmyRanks implements IUseGun {
    private String weaponName;
    private boolean battleReady;

    private static Logger logger = LogManager.getLogger(Runner.class.getName());

    public Soldiers(String fName, String lName, int age, int yearsOfExperience, String weaponName, boolean battleReady) {
        super(fName, lName, age, yearsOfExperience);
        this.weaponName = weaponName;
        this.battleReady = battleReady;
    }

    public String toString(){
        return getfName() + " " + getlName();
    }
    public int hashCode(){
        return Objects.hash(getfName(), getlName(), getAge(), this.weaponName, this.battleReady);
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }
        Soldiers soldier = (Soldiers) obj;
        return (soldier.getfName().equals(this.getfName())) && (soldier.getlName().equals((this.getlName())));
    }

    @Override
    public void useGun(boolean aiming, boolean firing, int ammunition){
        logger.info("Method to use the gun");
    }

    @Override
    public void reloading(boolean isReloading) {
        logger.info("If the gun is reloading");
    }
}
