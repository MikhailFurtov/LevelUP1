package ru.LavelUP.lesson1;

import java.util.Scanner;

public class dz2p10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        if(scn.hasNextInt()){
            int ch = scn.nextInt();
            for(int i = 1;i<=ch;i++){
                int ost = ch % i;
                if (ost==0) {
                    System.out.println(i);
                }


            }

        }
        else{
            System.out.println("введите число!");
        }
    }
}
