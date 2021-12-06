package ru.LavelUP.dz.dz3;

import java.util.Arrays;

public class ArrayUtil {
    //    int[] array = new int[100];
    void min(long array[]) {
        Arrays.sort(array);
        System.out.println(array[0]);
    }

    void max(long array[]) {
        Arrays.sort(array);
        for (int i=0;i<=array.length;i++){
            int a =i-1;
            if (i==array.length){
                System.out.println(array[a]);
            }
        }
    }
}
