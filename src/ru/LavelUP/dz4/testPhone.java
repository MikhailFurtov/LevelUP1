package ru.LavelUP.dz4;

public class testPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone(131141, 2.5 , "Apple");

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

        System.out.println(phone1.weight+" "+ phone1.model+" "+phone1.number);
        System.out.println("---------------------");
        Phone phone4 = new Phone(412556, "Sara");
        System.out.println("---------------------");
        System.out.println(phone4.number+"  "+phone4.model);
        phone1.receiveCall("Kirill");
        System.out.println("---------------------");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println("---------------------");
        phone2.receiveCall("Evgeni", 323141421);
        System.out.println("---------------------");
        System.out.println(phone1.number);
        phone1.sendMessages("dada","3131");
    }

}
