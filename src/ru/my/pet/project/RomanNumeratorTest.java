package ru.my.pet.project;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RomanNumeratorTest {

    @Test
    public void when1ThenI() {
        assertEquals("I", RomanNumerator.toRoman(1));
    }

    @Test
    public void when2ThenII() {
        assertEquals("II", RomanNumerator.toRoman(2));
    }

    @Test
    public void when4ThenIV() {
        assertEquals("IV", RomanNumerator.toRoman(4));
    }

    @Test
    public void when5ThenV() {
        assertEquals("V", RomanNumerator.toRoman(5));
    }

    @Test
    public void when7ThenVII() {
        assertEquals("VII", RomanNumerator.toRoman(7));
    }

}
