package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvenNumberTest {
    EvenNumber evenNumber=new EvenNumber();

    @Before
    public void setUp()
    {
        System.out.println("Before");
        evenNumber=new EvenNumber();
    }

    @After
    public void tearDown()
    {
        System.out.println("After");
        evenNumber=null;
    }

    @Test
    public void CheckEvenNumber()

    {
        //assert
        assertTrue(evenNumber.isEven(312));
    }
    @Test
    public void CheckOddNUmber()
    {

        boolean expectedValue=false;
        boolean actualValue=evenNumber.isEven(313);
        //assert
        assertEquals(expectedValue,actualValue);

    }
    @Test
    public void CheckNotOddNumber()
    {

        boolean expectedValue=false;
        boolean actualValue=evenNumber.isEven(312);
        //assert
        assertNotEquals(expectedValue,actualValue);
    }

}
