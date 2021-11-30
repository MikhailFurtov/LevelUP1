package ru.LavelUP.lesson1;

import java.util.Scanner;

public class dz2p2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите два числа:");
        if (scn.hasNextInt()) {
            String sa = "Ближе к 10: ";
            float m = scn.nextFloat();
            float n = scn.nextFloat();
            float ch = 10;
            float a = Math.abs(m - ch);
            float b = Math.abs(n - ch);
            if (a < b) {
                System.out.println(sa + m);
            } else {
                System.out.println(sa + n);
            }
            }
        else{
                System.out.println("Введите число!");
            }

        }
    }


