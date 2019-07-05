package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Before
    public void setUp()  {
        System.out.println("After");

    }

    @After
    public void tearDown()
    {
        System.out.println("Before");
    }


    @Test
    public void CheckFactorial()
    {
        //assert
        assertEquals(120,Factorial.longFactorial(5));

    }


    @Test
    public void CheckFactorialof0()
    {
        //assert
        assertEquals(1,Factorial.longFactorial(1));

    }


}
