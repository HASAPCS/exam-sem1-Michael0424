package com.example;

import java.lang.reflect.Constructor;


public class StepTracker{
    private int minSteps;
    private int totalSteps;
    private int totalDays;
    private int activeDays;

    public StepTracker(int minSteps){
    
        this.minSteps=minSteps;
        this.totalSteps=totalSteps;
        this.totalDays=totalDays;
        this.activeDays=activeDays;
    }


    public int getMinSteps() {
        return minSteps;
    }
    public int gettotalSteps(){
        return totalSteps;
    }
    public int gettotalDays(){
        return totalDays;
    }
    public int getactiveDays(){
        return activeDays;
    }



}

//write your class implementation here
