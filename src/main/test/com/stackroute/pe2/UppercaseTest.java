package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class UppercaseTest {
    private static Uppercase uppercase;
    @BeforeClass
    public static void setup() {
// This methods runs, before running any one of the test case
// This method is used to initialize the required variables
        uppercase = new Uppercase();
    }
    @AfterClass
    public static void teardown() {
// This method runs, after running all the test cases
// This method is used to clear the initialized variables
        uppercase = null;
    }
    @Test
    public void getUpperCase() throws IOException {
// getting the file from resources folder
        File file = new File("/home/mritunjay/Documents/Java/Java_PROGRAM_PE_2/src/main/resources/test4.txt");
        assertEquals("hello, is it me you are looking for? i can see it in your eyes 12345678@#$%.",uppercase.getUpperCase(file.getAbsolutePath()));
        assertNull("The return value should be null",uppercase.getUpperCase(""));
    }
}
