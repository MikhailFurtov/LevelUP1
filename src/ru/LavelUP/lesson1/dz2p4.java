package ru.LavelUP.lesson1;

import java.util.Random;

public class dz2p4 {

    public static void main(String[] args) {
        Random r = new Random();
        int ch = r.nextInt(900) + 100;
        int n1 = ch / 100;
        int n2 = ch / 10 % 10;
        int n3 = ch % 10;
        if (n1 > n2 && n1 > n3) {
            System.out.println("В числе " + ch + " наибольшее: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("В числе " + ch + " наибольшее: " + n2);
        } else {
            System.out.println("В числе " + ch + " наибольшее: " + n3);
        }

    }
}
