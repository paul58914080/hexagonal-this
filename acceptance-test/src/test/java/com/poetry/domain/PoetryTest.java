package com.poetry.domain;

import com.poetry.domain.ports.ObtainPoem;
import com.poetry.domain.ports.RequestVerse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class PoetryTest {

    @Test
    @DisplayName("Should get verse when asked for poetry")
    public void testTheLeftSidePort() {
        RequestVerse poetryReader = new PoetryReader();
        String verse = poetryReader.getPoetry();
        Assertions.assertEquals("Twinkle Twinkle little star", verse);
    }

    @Test
    @DisplayName("Should be able to get verses when asked for poetry from a poetry library")
    public void testTheRightSidePort(@Mock ObtainPoem obtainPoem) {
        Mockito.lenient().when(obtainPoem.getMeSomePoetry()).thenReturn("Jonny Jonny Yes Pappa");
        RequestVerse poetryReader = new PoetryReader(obtainPoem);
        String verse = poetryReader.getPoetry();
        Assertions.assertEquals("Jonny Jonny Yes Pappa", verse);
    }
}
