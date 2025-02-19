package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;


import static org.example.NumberUtils.add;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    /**
     *
     * Step 1: understand the requirement, input type and output type
     *        Requirement: Add two list of integer, index by index, and returns another list
     *
     * Step 2 (raw):  Perform partition and boundary analysis on input and output
     *        Each input: left | right
     *        Combination of input:
     *        Output:
     *  Step 3: Derive potential test cases
     *
     */
    @Test
    @DisplayName("Left is null")
    void leftIsNull() {
        List<Integer> right = new ArrayList<>();
        right.add(1);
        assertEquals(add(null, right),null);
    }

    @Test
    @DisplayName("Right is null")
    void rightIsNull() {
        List<Integer> left = new ArrayList<>();
        left.add(1);
        assertEquals(add(left, null), null);
    }

    @Test
    @DisplayName("Left is empty")
    void leftIsEmpty() {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        right.add(1);
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        assertEquals(add(left, right), answer);
    }
    @Test
    @DisplayName("Right is empty")
    void righIsEmpty() {
        List<Integer> left = new ArrayList<>();
        left.add(1);
        List<Integer> right = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        assertEquals(add(left, right), answer);
    }

    //tests when input arrays are both length ==1
    @Test
    @DisplayName("Sum does not require carrying a one when both input lengths ==1")
    void sumNoCarryOne() {
        List<Integer> left = new ArrayList<>();
        left.add(6);
        List<Integer> right = new ArrayList<>();
        right.add(3);
        List<Integer> answer = new ArrayList<>();
        answer.add(9);
        assertEquals(add(left, right), answer);
    }
    @Test
    @DisplayName("Sum does require carrying a one when both input lengths ==1")
    void  sumCarryOne() {
        List<Integer> left = new ArrayList<>();
        left.add(6);
        List<Integer> right = new ArrayList<>();
        right.add(7);
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(3);
        assertEquals(add(left, right), answer);
    }
    @Test
    @DisplayName("Sum removes leading zeros when both input lengths ==1")
    void  sumRemovesZeroOne() {
        List<Integer> left = new ArrayList<>();
        left.add(0);
        left.add(6);
        List<Integer> right = new ArrayList<>();
        right.add(0);
        right.add(7);
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(3);
        assertEquals(add(left, right), answer);
    }

    //tests when left input length>1 and right input length==1
    @Test
    @DisplayName("Sum does not require carrying a one when left input length>1 and right input length=1")
    void sumNoCarryLeftGreaterThanOne() {
        List<Integer> left = new ArrayList<>();
        left.add(2);
        left.add(3);
        List<Integer> right = new ArrayList<>();
        right.add(6);
        List<Integer> answer = new ArrayList<>();
        answer.add(2);
        answer.add(9);
        assertEquals(add(left, right), answer);
    }
    @Test
    @DisplayName("Sum does require carrying a one tests when left input length>1 and right input length==1")
    void  sumCarryLeftGreaterThanOne() {
        List<Integer> left = new ArrayList<>();
        left.add(1);
        left.add(6);
        List<Integer> right = new ArrayList<>();
        right.add(7);
        List<Integer> answer = new ArrayList<>();
        answer.add(2);
        answer.add(3);
        assertEquals(add(left, right), answer);
    }
    @Test
    @DisplayName("Sum removes leading zeros when left input length>1 and right input length=1")
    void  sumRemovesZeroLeftGreaterThanOne() {
        List<Integer> left = new ArrayList<>();
        left.add(0);
        left.add(1);
        left.add(6);
        List<Integer> right = new ArrayList<>();
        right.add(0);
        right.add(7);
        List<Integer> answer = new ArrayList<>();
        answer.add(2);
        answer.add(3);
        assertEquals(add(left, right), answer);
    }

    //tests when left input length==1 and right input length>1
    @Test
    @DisplayName("Sum does not require carrying a one when left input length==1 and right input length>1")
    void sumNoCarryRightGreaterThanOne() {
        List<Integer> left = new ArrayList<>();
        left.add(6);
        List<Integer> right = new ArrayList<>();
        right.add(2);
        right.add(3);
        List<Integer> answer = new ArrayList<>();
        answer.add(2);
        answer.add(9);
        assertEquals(add(left, right), answer);
    }
    @Test
    @DisplayName("Sum does require carrying a one when left input length==1 and right input length>1")
    void  sumCarryRightGreaterThanOne() {
        List<Integer> left = new ArrayList<>();
        left.add(7);
        List<Integer> right = new ArrayList<>();
        right.add(1);
        right.add(6);
        List<Integer> answer = new ArrayList<>();
        answer.add(2);
        answer.add(3);
        assertEquals(add(left, right), answer);
    }
    @Test
    @DisplayName("Sum removes leading zeros when left input length==1 and right input length>1")
    void  sumRemovesZeroRightGreaterThanOne() {
        List<Integer> left = new ArrayList<>();
        left.add(0);
        left.add(7);
        List<Integer> right = new ArrayList<>();
        right.add(0);
        right.add(1);
        right.add(6);
        List<Integer> answer = new ArrayList<>();
        answer.add(2);
        answer.add(3);
        assertEquals(add(left, right), answer);
    }


    //tests when input arrays are both length >1
    @Test
    @DisplayName("Sum does not require carrying a one when both input lengths >1")
    void sumNoCarryGreaterThanOne() {
        List<Integer> left = new ArrayList<>();
        left.add(2);
        left.add(3);
        List<Integer> right = new ArrayList<>();
        right.add(4);
        right.add(2);
        List<Integer> answer = new ArrayList<>();
        answer.add(6);
        answer.add(5);
        assertEquals(add(left, right), answer);
    }
    @Test
    @DisplayName("Sum does require carrying a one when both input lengths ==1")
    void  sumCarryGreaterThanOne() {
        List<Integer> left = new ArrayList<>();
        left.add(3);
        left.add(6);
        List<Integer> right = new ArrayList<>();
        right.add(4);
        right.add(8);
        List<Integer> answer = new ArrayList<>();
        answer.add(8);
        answer.add(4);
        assertEquals(add(left, right), answer);
    }
    @Test
    @DisplayName("Sum removes leading zeros when both input lengths ==1")
    void  sumRemovesZeroGreaterThanOne() {
        List<Integer> left = new ArrayList<>();
        left.add(0);
        left.add(3);
        left.add(6);
        List<Integer> right = new ArrayList<>();
        right.add(0);
        right.add(4);
        right.add(8);
        List<Integer> answer = new ArrayList<>();
        answer.add(8);
        answer.add(4);
        assertEquals(add(left, right), answer);
    }


    @Test
    @Tag ("Created_after_coverage_test")
    @DisplayName("Catching an IllegalArgumentException")
    void illegalArgumentTest(){
        List<Integer> left = new ArrayList<>();
        left.add(-2);
        List<Integer> right = new ArrayList<>();
        right.add(-4);
        List<Integer> answer = new ArrayList<>();
        answer.add(-6);
        boolean caught = false;
        try {
            add(left, right);
        } catch (Exception e) {
            caught = true;
        }
        assertTrue(caught);
    }


    @Test
    @Tag ("Mutation")
    @DisplayName("Catching the boundaries in if statement")
    void ifBoundaryTest(){
        List<Integer> left = new ArrayList<>();
        left.add(0);
        left.add(9);
        List<Integer> right = new ArrayList<>();
        right.add(0);
        right.add(9);
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(8);
        assertEquals(add(left,right), answer);
    }

    @Test
    @Tag("Mutation")
    @DisplayName("Catching result.size() >= 1")
    void resultEqualOneTest(){
        List<Integer> left = new ArrayList<>();
        left.add(0);
        List<Integer> right = new ArrayList<>();
        right.add(0);
        List<Integer> answer = new ArrayList<>();
        answer.add(0);
        List<Integer> trueArr = add(left, right);
        assertEquals(trueArr.size(), 1);
    }

    @Test
    @Tag("Mutation")
    @DisplayName("Catching carry >= 0")//accidentally got the loop too
    void carryEqualZeroTest(){
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        assertEquals(add(left,right), answer);
    }
}