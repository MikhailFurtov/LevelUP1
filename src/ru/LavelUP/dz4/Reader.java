package ru.LavelUP.dz4;

import java.util.Arrays;

public class Reader {
    String fio;
    int numbertiket;
    String fakutelet;
    String date;
    String phone;

    public Reader(String fio, int numbertiket, String fakutelet, String data, String phone) {
        this.fio = fio;
        this.numbertiket = numbertiket;
        this.fakutelet = fakutelet;
        this.date = data;
        this.phone = phone;
    }

    void takeBook(int number) {
        System.out.println(fio + " взял " + number + " книги.");
    }
    void takeBook(String... array){
        System.out.println(fio + " взял " + Arrays.toString(array) + " книги.");
    }
    void returnBook(int number) {
        System.out.println(fio + " вернул " + number + " книги.");
    }


}
