package ru.LavelUP.lesson2;

import java.util.Scanner;

public class gf {
    public static int[] coordinates;

    public static void main(String[] args) {
        coordinates = new int[200];
        for (int i = 0; i < 100; i++) {
            coordinates[i * 2] = i * 10;
            coordinates[i * 2 + 1] = i * 10 + 1;
        }
    }
}