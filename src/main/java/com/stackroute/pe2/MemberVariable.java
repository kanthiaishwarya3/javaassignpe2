package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.assertArrayEquals;
class  MemberVariable {
    String name;

    public String[] isMember(String name, int age, double salary) {
        String [] arr={name,String.valueOf(age),String.valueOf(salary)};
        return arr;
    }
}
