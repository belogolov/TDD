package ru.my.pet.project;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeapYearTest {

    @Test
    public void when2021ThenIsNotLeap() {
        assertFalse(LeapYear.isLeap(2021));
    }

    @Test
    public void when2024ThenIsLeap() {
        assertTrue(LeapYear.isLeap(2024));
    }

    @Test
    public void when1900ThenIsNotLeap() {
        assertFalse(LeapYear.isLeap(1900));
    }

    @Test
    public void when2000ThenIsLeap() {
        assertTrue(LeapYear.isLeap(2000));
    }
}
