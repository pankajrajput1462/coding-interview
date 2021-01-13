package collections.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StackTest {

    @Test
    void isBracketMatch() {
        final BracketMatch bracketMatch = new BracketMatch();
        assertTrue(bracketMatch.isBracketMatch("{()}"));
        assertTrue(bracketMatch.isBracketMatch("((()))"));
        assertTrue(bracketMatch.isBracketMatch("[{()}]"));
        assertFalse(bracketMatch.isBracketMatch("{(}"));
        assertFalse(bracketMatch.isBracketMatch("{()"));
        assertFalse(bracketMatch.isBracketMatch("{{{{{"));
        assertFalse(bracketMatch.isBracketMatch("{{()}"));
        assertFalse(bracketMatch.isBracketMatch("{{( ) }"));
    }

    @Test
    void expressionEvaluation() {
//        final int evaluate1 = new ExpressionEvaluation().evaluate("4 + 55");
        final int evaluate2 = new ExpressionEvaluation().evaluate("(4+55)+(4*6)");
//        assertEquals(59, evaluate1);
        assertEquals(83, evaluate2);

    }

}