package com.example;

import java.lang.reflect.Constructor;

public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int totalDays;
    private int activeDays;

    public StepTracker(int minSteps) {

        this.minSteps = minSteps;
        this.totalSteps = 0;
        this.totalDays = 0;
        this.activeDays = 0;
    }

    public int getMinSteps() {
        return minSteps;
    }

    public int gettotalSteps() {
        return totalSteps;
    }

    public int gettotalDays() {
        return totalDays;
    }

    public int getactiveDays() {
        return activeDays;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        if (steps >= minSteps) {
            activeDays += 1;
        }
        totalDays += 1;

    }
    

    public double averageSteps() {
        return totalDays = totalSteps / totalDays;
    }

    public void dailySteps(){
        
    }
    


}

// write your class implementation here
