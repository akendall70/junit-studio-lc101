package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testBracketWithWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[JavaScript]"));
    }

    @Test
    public void testBracketInMiddleOfSentence() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void testWithBracketsAtBeginning() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testWithNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testFalseWithMissingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testFalseWithNoClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void testFalseIfSingleBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void testFalseIfBracketsReversedNoChars() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testMultiplePairedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void testAlwaysFailIfStartsWithOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][][][][]"));
    }

    @Test
    public void testOnlyTextCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

}
