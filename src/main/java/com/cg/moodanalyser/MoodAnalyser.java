package com.cg.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        message="I am in Happy Mood";
    }
    public MoodAnalyser(String message) {
        this.message=message;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to mood analyzer program\n");
    }
    public String analyzeMood() {
        if(message.contains("Sad"))
            return "SAD";
        else return "HAPPY";
    }
}
