package com.cg.moodanalyser;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTest {
    @Test
    public void returnsSAD_whenmessage_ContainsSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Sad Mood");
        assertEquals("SAD",moodAnalyser.analyzeMood());
    }

    @Test
    public void returnsHappy_whenmessage_NotContainsSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        assertEquals("HAPPY",moodAnalyser.analyzeMood());
    }
    @Test
    public void returnsHappy_whenmessage_isNull() {
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        assertEquals("HAPPY",moodAnalyser.analyzeMood());
        }

}
