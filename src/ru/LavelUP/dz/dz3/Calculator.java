package ru.LavelUP.dz.dz3;

public class Calculator {
    void plus (int a, int b){
        System.out.println(a+=b);
    }
   void plus (double a, double b){
        System.out.println(a+=b);
    }
    void plus (long a, long b){
        System.out.println(a+=b);
    }
    void division (long a, long b) {
        System.out.println(a =a/b);
    }
    void division (int a, int b) {
        System.out.println(a =a/b);
    }
    void division (double a, double b) {
        System.out.println(a =a/b);
    }
    void multiplication (double a, double b) {
        System.out.println(a = a * b);
    }
    void multiplication (int a, int b) {
        System.out.println(a = a * b);
    }
    void multiplication (long a, long b) {
        System.out.println(a = a * b);
    }
    void subtraction (long a, long b) {
        System.out.println(a = a - b);
    }
    void subtraction (double a, double b) {
        System.out.println(a = a - b);
    }
    void subtraction (int a, int b) {
        System.out.println(a = a - b);
    }


}
