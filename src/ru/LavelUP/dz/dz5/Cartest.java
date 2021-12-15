package ru.LavelUP.dz.dz5;

public class Cartest {
    public static void main(String[] args) {
    Car car1 = new Car("kia","j341");
    Car car2 = new Car("kia","j341");
        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car1));
        System.out.println(car1.hashCode()+ " " +car2.hashCode());


    }
}
