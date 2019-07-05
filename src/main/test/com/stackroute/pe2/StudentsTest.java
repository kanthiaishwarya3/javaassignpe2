package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class StudentsTest
{

    private Students studentGrades;
    private PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp(){
        studentGrades = new Students();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown(){
        studentGrades = null;
        System.setOut(originalOut);
    }

    @Test
    public void givenInputShouldReturnGrades(){
        studentGrades.calculateGrade(4,78,56,23,67);

        //assert
        assertEquals("The average is 56\nThe minimum is 23\nThe maximum is 78",outContent.toString());
    }

    @Test
    public void givenInputShouldReturnInvalidGrades(){
        studentGrades.calculateGrade(4,104,-67,23,78);

        //assert
        assertEquals("Please enter valid grades",outContent.toString());
    }

    @Test
    public void givenInputShouldReturnMissingGrades(){
        studentGrades.calculateGrade(4,90,35,59);

        //assert
        assertEquals("You need to enter 4 grades. But you have entered only 3 grades",outContent.toString());
    }


}
