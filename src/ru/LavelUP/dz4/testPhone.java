package ru.LavelUP.dz4;

public class testPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.weight = 2.5;
        phone1.model = "Moto";
        phone1.number = 494149232;

        Phone phone2 = new Phone();
        phone2.weight = 4.8;
        phone2.model = "Nokia";
        phone2.number = 524149232;

        Phone phone3 = new Phone();
        phone3.weight = 1.7;
        phone3.model = "Samsung";
        phone3.number = 864149232;


        System.out.println(phone1.weight);
        System.out.println(phone1.model);
        System.out.println(phone1.number);
        phone1.receiveCall("Kirill");
        phone1.getNumber();
    }

}
