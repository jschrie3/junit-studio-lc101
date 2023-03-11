package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    // POSITIVE TEST CASES
    // Does the program work as expected with valid input?
    // TODO: TEST #1 - refactor sample test from instructions to use AAA pattern and message parameter
    @Test
    public void onlyBracketsReturnsTrue() {
        // include a spec to give info on what the test includes
        String spec =  "a single set of balanced brackets returns true";
        // include test data to give the method
        String testData = "[]";
        // where the result is the test condition
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        // using a constructor that will print a message before the test
        assertTrue(spec, result);
    }

    // TODO: TEST #2 - test balanced brackets in front of other characters - "[]LaunchCode"
    @Test
    public void pairOfBracketsBeforeOtherCharacters() {
        String spec =  "pair of brackets before other characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    // TODO: TEST #3 - test balanced brackets around other characters - "[LaunchCode]"
    @Test
    public void pairOfBracketsAroundOtherCharacters() {
        String spec =  "pair brackets around other characters returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    // TODO: TEST #4 - test balanced brackets within other characters - "Launch[Code]"
    @Test
    public void pairOfBracketsWithinOtherCharacters() {
        String spec =  "pair of brackets within other characters returns true";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    // TODO: TEST #5 - test multiple connecting pairs of balanced brackets - "[][][]"
    @Test
    public void connectingPairsOfBrackets() {
        String spec =  "multiple connecting pairs of balanced brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    // TODO: TEST #6 - test multiple nested brackets - "[[[]]]"
    @Test
    public void nestedPairsOfBrackets() {
        String spec =  "multiple pairs of nested balanced brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    // NEGATIVE TEST CASES
    // Does the program work as expected with invalid input?

    // TODO: TEST #7 - test single opening bracket - "["
    @Test
    public void singleOpeningBracketReturnsFalse() {
        String spec =  "single opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    // TODO: TEST #8 - test single closing bracket - "]"
    @Test
    public void singleClosingBracketReturnsFalse() {
        String spec = "single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    // TODO: TEST #9 - test reversed brackets - "]["
    @Test
    public void reversedPairOfBracketsReturnsFalse() {
        String spec = "single pair of reversed brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    // initially test #9 fails, so we have to edit the code in BalancedBrackets

    // TODO: TEST #10 - test single bracket before other characters - "[LaunchCode"
    @Test
    public void singleBracketBeforeOtherCharacters() {
        String spec = "single bracket before other characters returns false";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    // TODO: TEST #11 - unbalanced brackets amoung other characters - "Launch]Code["
    @Test
    public void unbalancedBracketsAmongOtherCharacters() {
        String spec = "pair of unbalanced brackets among other characters returns false";
        String testData = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    // TODO: TEST #12 - test a series of mixed unbalanced brackets - "[[]][]["
    @Test
    public void seriesUnbalancedBrackets() {
        String spec = "series of unbalanced brackets returns false";
        String testData = "[[]][][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    // TEST EDGE CASES
    // Testing the ends (or edges) of the range of valid inputs

    // TODO: TEST #13 - test string with only characters - "LaunchCode"
    @Test
    public void onlyCharacters() {
        String spec = "string with only characters returns true";
        String testData = "LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    // TODO: TEST #14 - test empty string - ""
    @Test
    public void emptyString() {
        String spec = "empty string returns false";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
}
