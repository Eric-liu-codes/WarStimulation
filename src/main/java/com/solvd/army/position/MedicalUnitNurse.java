package com.solvd.army.position;

import com.solvd.army.IUseMedicalDevice;

import java.util.Objects;

public class MedicalUnitNurse extends ArmyRanks implements IUseMedicalDevice {
    private String profession;
    private boolean readyForTreatment;
    public MedicalUnitNurse(String fName, String lName, int age, int yearsOfExperience, String profession, boolean readyForTreatment) {
        super(fName, lName, age, yearsOfExperience);
        this.profession = profession;
        this.readyForTreatment = readyForTreatment;
    }

    @Override
    public String toString(){
        return getfName() + " " + getlName();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getfName(), getlName(), profession);
    }
    @Override
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
        MedicalUnitNurse nurse = (MedicalUnitNurse) obj;
        return (nurse.getfName().equals(this.getfName())) && (nurse.getlName().equals(this.getlName()))
                && (nurse.profession.equals(profession));
    }

    @Override
    public void turnOnMachine(boolean machineOn) {}

    @Override
    public void useMachine(int inputData, String inputFName, String inputLName) {}
}
