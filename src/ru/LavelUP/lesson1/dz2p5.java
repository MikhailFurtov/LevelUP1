package ru.LavelUP.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class dz2p5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            System.out.println("Введите три целых попарно неравных между собой числа ");
            int[] mas = new int[3];
            for ( int i=0; i<3; i++){
                mas[i] = scn.nextInt();
            }
            if( mas[0] != mas[1] && mas[1] != mas[2] && mas[0] != mas[2]){
                Arrays.sort(mas);
                System.out.println(Arrays.toString(mas));
            }
            else {
                System.out.println("Числа равны, нужны попарно неравные между собой числа!");
            }
        }
        else {
            System.out.println("Надо вводить число!!!1");
        }
    }
}
