package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {
    Students students;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
// This method is used to initialize the required variables
        students=new Students();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
// This method is used to clear the initialized variables
        students=null;
    }

    @Test
    public void average() {
        int inputArray[]={25,25,25,25};
        assertEquals(25,students.average(inputArray));//checking expected and actual values
        assertNotEquals(100,students.average(inputArray));
    }
    @Test
    public void averageExceeded() {
        int inputArray[]={25,25,101,25};
        assertNotNull("Null is not Expected!",students.average(inputArray));
    }

    @Test
    public void lowest() {
        int inputArray[]={49,33,34,57};
        assertEquals(33,students.lowest(inputArray));//checking expected and actual values
        assertNotEquals(49,students.lowest(inputArray));
    }

}
