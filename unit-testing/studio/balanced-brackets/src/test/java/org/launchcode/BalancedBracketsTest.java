package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    };
    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "A single set of balanced brackets return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    };
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    };
    @Test
    public void balancedBracketsInFrontReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    };
    @Test
    public void balancedBracketsAroundOtherCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    };
    @Test
    public void balancedBracketsWithinOtherCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    };
    @Test
    public void multipleConsecutiveBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    };
    @Test
    public void multipleNestedBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    };
    @Test
    public void singleOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    };
    @Test
    public void singleClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    };
    @Test
    public void reversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    };
    @Test
    public void singleBracketWithOtherCharactersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    };
    @Test
    public void reversedBracketsWithOtherCharactersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    };
    @Test
    public void mixedUnbalancedBracketsWithOtherCharactersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]][]["));
    };
}