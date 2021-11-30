package ru.LavelUP.lesson1;

import java.util.Scanner;

public class dz2p1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число");
        if (scn.hasNextInt()){
            int a = scn.nextInt();
            if (a % 2 == 0) {
                System.out.println("Четное");
            } else {
                System.out.println("Нечетное");
        }
        }else{
            System.out.println("Нужно число!");
        }
    }
}
