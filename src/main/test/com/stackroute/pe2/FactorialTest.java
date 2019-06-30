package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Before
    private void setUp() throws Exception {
        // This methods runs, before running any one of the test case
// This method is used to initialize the required variables
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
// This method is used to clear the initialized variables
    }

    @Test
    public void TestlongFactorial() {
        assertEquals(120,Factorial.longFactorial(5));//checking expected and actual values
        assertEquals(2,Factorial.longFactorial(2));//checking expected and actual values
        assertEquals(1,Factorial.longFactorial(0));//checking expected and actual values

    }

}
