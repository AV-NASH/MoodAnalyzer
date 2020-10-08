package com.cg.moodanalyser;

public class MoodAnalyser {

    private String message;

    enum MOOD {EMPTY, NUll, VALID;}

    public MoodAnalyser() {
        message = "I am in Happy Mood";

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to mood analyzer program\n");
    }

    public String analyzeMood() {

        if (invalidMoodTest().equals(MOOD.EMPTY))
            throw new MoodAnalysisException("Ivalid input,Empty mood is not allowed");
        else {
            if (invalidMoodTest().equals(MOOD.NUll))
                throw new MoodAnalysisException("Ivalid input,Null value is not allowed");
            else {
                if (message.contains("Sad"))
                    return "SAD";
                else
                    return "HAPPY";
            }
        }
    }

    public MOOD invalidMoodTest() {
        MOOD moodcheck = MOOD.VALID;
        if (message == null) moodcheck = MOOD.NUll;

        else {
            if (message.isEmpty()) moodcheck = MOOD.EMPTY;
        }

        return moodcheck;
    }
}
