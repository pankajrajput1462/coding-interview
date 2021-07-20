package onlineexam;

import onlineexam.one.DistributeBalls;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DistributeBallsTest {
    /*
    Given N balls. For convenience, we denote color of each ball as — lowercase letter. We have to distribute N balls among K people.
     They will be upset, if they get two balls of the same color. We can give any number of balls to people and they won’t be upset
      even if they do not get any ball, but, we have to distribute all balls, such that no one will be upset — print YES,
       if it is possible , and NO, otherwise.
    https://www.geeksforgeeks.org/distributing-all-balls-without-repetition/?ref=rp
    Examples:

        Input : 4 2 // value of N and K
                aabb // colors of given balls
        Output : YES
        We can give 1st and 3rd ball to the first person,
        and 2nd and 4th to the second.

        Input : 6 3 // value of N and K
                aacaab // colors of given balls
        Output : NO
        We need to give all balls of color a, but one
        ball will stay, that's why answer is NO
     */
    @Test
    void distributingBalls() {
        final DistributeBalls distributeBalls = new DistributeBalls();
        final String status = distributeBalls.distributingBalls(3, 6, "aacaab");
        Assertions.assertEquals("NO", status);
        Assertions.assertEquals("YES", distributeBalls.distributingBalls(2, 4, "aabb"));

    }
}