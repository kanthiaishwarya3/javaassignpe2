package com.stackroute.pe2;

public class Palindrome
{
    // Initialisation of strings
    String reverse="", temp = "";
    String output= "";

    public String checkStringPalindrome(String input)
    {
        temp = input;
        for (int i = input.length() - 1; i >= 0; i--)    // length() measures the size of string
        {
            reverse = reverse + input.charAt(i);        // charAt() takes individual characters from a string
        }

        if (reverse.equals(temp))
        {
            //System.out.println(reverse);
            output = "String is Palindrome";
        }
        else
        {
            output = "String is not Palindrome";
        }

        return output;
    }
}
