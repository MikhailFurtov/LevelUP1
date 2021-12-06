package ru.LavelUP.lesson2;

import java.util.Scanner;

public class tb {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(2%7);
        System.out.println(7%5);
        System.out.println(7%14);
        System.out.println(7%17);
        System.out.println("///////////////");
        System.out.println(2/7);
        System.out.println(7/5);
        System.out.println(7/14);
        System.out.println(7/17);
        System.out.println("///////////////");


        while (i <= 20)
        {
            if ( (i % 7) == 0 )
            {
                i++;
                continue;
            }

            System.out.println(i);
            i++;
        }
    }
}

