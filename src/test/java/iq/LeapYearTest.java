package iq;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void isLeapYear() {
        LeapYear leapYearMain = new LeapYear();
        Assertions.assertFalse(leapYearMain.isLeapYear(1300));
        Assertions.assertTrue(leapYearMain.isLeapYear(1600));
        Assertions.assertFalse(leapYearMain.isLeapYear(1000));
        Assertions.assertTrue(leapYearMain.isLeapYear(2024));
    }
}