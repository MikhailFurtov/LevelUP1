package ru.LavelUP.dz4;

public class Phone {
    int number;
    double weight;
    String model;

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    int getNumber() {
        return number;
    }
}

