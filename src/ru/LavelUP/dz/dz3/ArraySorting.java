package ru.LavelUP.dz.dz3;

import java.util.Arrays;

public class ArraySorting {

        void bubbleSort(int[] array){
            for (int i = 0; i < array.length-1; i++) {
                for (int j = array.length-1; j>i; j--) {
                    if (array[j-1]>array[j]){
                        int a = array[j-1];
                        array[j-1] = array[j];
                        array[j]=a;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
}