package com.example.project;
import java.util.Random;

public class Day4 {

    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer {
        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int distanceTraveled;
        private int currentRunTime;
        private int currentRestTime;
        private boolean isRunning;

        // Constructor
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            this.distanceTraveled = 0;
            this.currentRunTime = 0;
            this.currentRestTime = 0;
            this.isRunning = true; // Starts in the running state
        }

        public String getName(){
            return name;
        }

        // Method to get the total distance traveled
        public int getDistanceTraveled() {
            return distanceTraveled;
        }

        // Simulate one second of the reindeer's movement
        public void simulateSecond() {
            if (isRunning) {
                distanceTraveled += speed; // Add distance based on speed
                currentRunTime++;

                if (currentRunTime >= runDuration) {
                    isRunning = false; // Switch to resting
                    currentRunTime = 0;
                }
            } else {
                currentRestTime++;

                if (currentRestTime >= restDuration) {
                    isRunning = true; // Switch to running
                    currentRestTime = 0;
                }
            }
        }
    }

    // Simulate the race and determine the winner
    public static String simulateRace(int time, Reindeer[] reindeers) {
        // Simulate each second of the race
        for (int second = 0; second < time; second++) {
            for (Reindeer reindeer : reindeers) {
                reindeer.simulateSecond();
            }
        }

        // Find the reindeer with the greatest distance traveled
        String winner = "";
        int maxDistance = 0;

        for (Reindeer reindeer : reindeers) {
            if (reindeer.getDistanceTraveled() > maxDistance) {
                maxDistance = reindeer.getDistanceTraveled();
                winner = reindeer.name;
            }
        }

        return winner;
    }

    public static void main(String[] args) { // for testing purposed

    }
}



