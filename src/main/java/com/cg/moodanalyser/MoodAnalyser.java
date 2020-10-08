package com.cg.moodanalyser;

public class MoodAnalyser {
    public static void main(String[] args) {
        System.out.println("Welcome to mood analyzer program\n");
    }
    public String analyzeMood(String message) {
        if(message.contains("Sad"))
            return "SAD";
        else return "HAPPY";
    }
}
