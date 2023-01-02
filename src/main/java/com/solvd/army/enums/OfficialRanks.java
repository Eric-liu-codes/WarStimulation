package com.solvd.army.enums;

public enum OfficialRanks {
    CAPTAIN("Commands 3-5 Platoons, or 60-200 Soldiers"),
    COLONEL("Commands 3 or more Battalions, or 1500-3200 Soldiers"),
    GENERAL("Commands 3 Brigades, or 10000-16000 Soldiers"),
    INTELLIGENCE_TEAM("Tasked to obtain information for the war"),
    LIEUTENANT("Commands 2-4 Squads, or 16-33 Soldiers"),
    MAJOR("Serves as the primary staff officer for Brigades"),
    MEDICAL_DOCTOR("Serve to tream injured patients"),
    MEDICAL_NURSE("Serve to help support Medical Doctors during treatments"),
    OPERATOR("Tasked to operate on weapons"),
    SERGEANT("Commands 4 Soldiers"),
    SOLDIER("Tasks to serve to the country during a crisis or war");

    private String task;

    OfficialRanks(String task){}

    public String getTask() {
        return task;
    }
}
