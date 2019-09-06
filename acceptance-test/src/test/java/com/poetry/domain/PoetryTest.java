package com.poetry.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class PoetryTest {

    @Test
    @DisplayName("Should get verse when asked for poetry")
    public void testTheLeftSidePort() {
        RequestVerse poetryReader = new PoetryReader();
        String verse = poetryReader.getPoetry();
        Assertions.assertEquals("Twinkle Twinkle little star", verse);
    }
}
