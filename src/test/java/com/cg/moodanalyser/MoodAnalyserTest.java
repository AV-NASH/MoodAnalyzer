package com.cg.moodanalyser;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTest {
    @Test
    public void returnsSAD_whenmessage_ContainsSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        assertEquals("SAD", moodAnalyser.analyzeMood());
    }

    @Test
    public void returnsHappy_whenmessage_NotContainsSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        assertEquals("HAPPY", moodAnalyser.analyzeMood());
    }

    @Test
    public void retrunsWarning_whenmessage_isNull() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyzeMood();
        } catch (MoodAnalysisException e) {
            assertEquals("Ivalid input,Null value is not allowed", e.getMessage());
        }
    }

    @Test
    public void retrunsWarning_whenmessage_isEmpty() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            moodAnalyser.analyzeMood();
        } catch (MoodAnalysisException e) {
            assertEquals("Ivalid input,Empty mood is not allowed", e.getMessage());
        }
    }

}
