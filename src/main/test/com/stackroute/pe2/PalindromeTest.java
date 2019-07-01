package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class PalindromeTest {
    Palindrome palindrome;
    @Test
    public void palindromeCheck(){
        palindrome=new Palindrome();
        String r=palindrome.palindromeMethod("hello");
        assertEquals("olleh",r);//checking expected and actual values
    }
    @Test
    public void emptyPalindrome()
    {
        palindrome=new Palindrome();
        String result=palindrome.palindromeMethod(" ");

        //assert
        assertEquals(" ",result);//checking expected and actual values

    }
    @Test
    public void palindromeChe(){
        palindrome=new Palindrome();
        String r=palindrome.palindromeMethod("wow");
        assertEquals("wow",r);//checking expected and actual values
    }

}