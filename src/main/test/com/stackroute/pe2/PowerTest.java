package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    private Power power;
    private int num;

    @Before
    public void setUp() throws Exception {


        power = new Power(); //creating the object

    }

    @After
    public void tearDown() throws Exception {
        power=null;

    }


    @Test
    public void validPower() throws Exception {

        Boolean expectedValue =true;

        Boolean actualValue = power.isPower(16);
        assertEquals(expectedValue, actualValue);

    }
    @Test
    public void invalidPower() throws Exception {

        Boolean expectedValue =false;

        Boolean actualValue = power.isPower(43);
        assertEquals(expectedValue, actualValue);

    }

}
