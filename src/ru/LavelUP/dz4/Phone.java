package ru.LavelUP.dz4;

import java.util.Arrays;

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
    public Phone(int number, double weight, String model){
        this.number = number;
        this.weight = weight;
        this.model = model;
    }
    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){
    }
    void receiveCall(String name, int number){
        System.out.println("Звонит " + name + number);
    }
    void sendMessages(String... array){

        System.out.println(Arrays.toString(array));
    }


}

