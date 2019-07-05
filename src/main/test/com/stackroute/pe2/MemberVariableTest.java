package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable membervariable;

    @Before
    public void setUp(){
        membervariable = new MemberVariable();
    }

    @After
    public void tearDown(){
        membervariable = null;
    }

    @Test
    public void givenValuesShouldReturnDetails() {
        //Arrange

        //Act
        String result = membervariable.Display("Ammu",21,2100000);
        //Assert
        assertEquals("Member's Name: Ammu\nMember's Age: 21\nMember's Salary: 2100000.0",result);
    }

    @Test
    public void givenNegativeValuesShouldReturnNull() {
        //Arrange

        //Act
        String result = membervariable.Display("Ammu",-21,2100000);
        assertNull(result);
        result = membervariable.Display("Harry",21,-2100000);
        assertNull(result);
    }
}