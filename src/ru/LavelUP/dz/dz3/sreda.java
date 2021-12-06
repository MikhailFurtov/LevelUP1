package ru.LavelUP.dz.dz3;

public class sreda {
    public static void main(String[] args) {
        /*
        Проверяем калькулятор
         */
        Calculator calc = new Calculator();
        calc.plus(6,6);
        calc.plus(6.5,0.6);
        calc.division(15,4);
        /* Проверяем массв
        */
        System.out.println("/////////////////////////////////");
        ArrayUtil mm = new ArrayUtil();
        long[] ar = {3,5,8,2,4,5,6,7,3,9,1,6,8,11,124,524,32,5,1,6,8,14};
        mm.min(ar);
        mm.max(ar);
        //Проверяем сортировку 
        System.out.println("/////////////////////////////////");
        ArraySorting bp = new ArraySorting();
        int[] fg = {3,15,8,2,4,11,6,9,3};
        bp.bubbleSort(fg);
    }
}
