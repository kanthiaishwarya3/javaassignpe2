package com.stackroute.pe2;

import java.util.Scanner;

public class Average {
    static  int compute(int a[],int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+a[i];
        }
        return sum/n;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        int[] g=new int[20];
        System.out.println("enter the number of students");
        n=s.nextInt();
        if(n>0&&n<=100) {
            for (int i = 1; i <= n; i++) {
                System.out.print("enter the grade of student" + i + ":");
                g[i] = s.nextInt();
            }
            System.out.println("the average" + compute(g, n));
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i; j++) {
                    if (g[j] > g[j + 1]) {
                        int temp = g[j];
                        g[j] = g[j + 1];
                        g[j + 1] = temp;

                    }
                }
            }
           /* for(int i=1;i<=n;i++)
            {
                System.out.println(g[i]);
            }*/
            System.out.println("The minimum is" + g[1]);
            System.out.println("the maximum is" + g[n]);
        }
        else
            System.out.println("enter value between 1 and 100");
    }
}
