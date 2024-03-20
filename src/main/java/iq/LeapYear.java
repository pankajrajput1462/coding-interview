package iq;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if (year < 0) {
            return false;
        } else {

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                }
                return true;
            }
        }
        return false;
    }

}
