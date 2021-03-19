package com.example.android3lesson6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {
    private Math math;

    @Before
    public void setup() {
        math = new Math();
        System.out.println("BEFORE");
    }

    @Test
    public void sumTest() {
        assertEquals(5, math.sum(3,2));
        assertEquals(5, math.sum(-10,15));
        System.out.println("SUM");
    }

    @Test
    public void divTest() {
        assertEquals(2, math.div(12,6));
        assertEquals(0, math.div(0,1));
        assertEquals(0,math.div(1,0));
        System.out.println("DIV");
    }

    @Test
    public void subtractionTest() {
        assertEquals(2, math.subtraction(2,0));
        assertEquals(12, math.subtraction(14,2));
        assertEquals(15, math.subtraction(20,5));
        System.out.println("SUB");
    }

    @Test
    public void multiplicationTest() {
        assertEquals(9, math.multiplication(3,3));
        assertEquals(21, math.multiplication(3,7));
        assertEquals(3, math.multiplication(3,1));
        System.out.println("MULT");
    }

    @Test
    public void reversWordsTest() {
        assertEquals("One Two Three Four", math.reversWords("Four Three Two One"));
        assertEquals("One Two Three", math.reversWords("Three Two One"));
        assertEquals("One Two", math.reversWords("Two One"));
        assertEquals("One", math.reversWords("One"));
        assertEquals("", math.reversWords(null));
        System.out.println(math.reversWords("REVERS"));
    }

    @After
    public void clear() {
        math = null;
        System.out.println("AFTER");
    }
}