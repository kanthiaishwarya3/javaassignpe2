package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest
{

    Palindrome stringpalindrome;
    String result="";

    @Before
    public void setUp()
    {
        stringpalindrome=new Palindrome();
    }
    @Test
    public void givenInputStringShouldReturnStringPalindrome()
    {
        // Passing string
        result=stringpalindrome.checkStringPalindrome("visiv");
        assertEquals("String palindrome condition failed","String is Palindrome",result);
    }
    @Test
    public void givenInputStringShouldReturnEmptyString()
    {
        // Null String criteria
        result=stringpalindrome.checkStringPalindrome("");
        //assert
        assertEquals("test case failed","String is Palindrome",result);
    }
    @Test
    public void givenInputStringShouldReturnSpace()
    {
        // String contains one space
        result=stringpalindrome.checkStringPalindrome(" ");
        //assert
        assertEquals("Palindrome condition failed","String is Palindrome",result);
    }
    @Test
    public void givenInputStringShouldReturnStringWithMultipleSpacesInString()
    {
        result=stringpalindrome.checkStringPalindrome("v i s i v");
        //assert
        assertEquals("test case failed","String is Palindrome",result);
    }
    @Test
    public void givenInputStringShouldReturnSingleCharacter()
    {
        // Single character is passed
        result=stringpalindrome.checkStringPalindrome("a");
        assertEquals("test case failed","String is Palindrome",result);
    }
    @Test
    public void givenInputStringShouldReturnAlphaNumericString()
    {
        // Alphanumeric as test case
        result=stringpalindrome.checkStringPalindrome("V8472 S 2748V");
        //assert
        assertEquals("test case failed","String is Palindrome",result);
    }

    @After
    public void tearDown()
    {
        stringpalindrome=null;
    }
}
