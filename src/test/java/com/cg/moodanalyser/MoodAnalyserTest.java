package com.cg.moodanalyser;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTest {
    @Test
    public void returnsSAD_whenmessage_ContainsSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        assertEquals("SAD",moodAnalyser.analyzeMood("I am in Sad Mood"));
    }

    @Test
    public void returnsHappy_whenmessage_NotContainsSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        assertEquals("HAPPY",moodAnalyser.analyzeMood("I am in Any Mood"));
    }
}