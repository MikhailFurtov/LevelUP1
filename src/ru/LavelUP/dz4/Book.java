package ru.LavelUP.dz4;

import java.util.Arrays;

public class Book  {
    int number;
    String namebook;
    String autor;

    public Book(String namebook, String autor){

        this.namebook = namebook;
        this.autor = autor;
    }
    void Bookinfo(){
        System.out.println("Автор: " + autor + " ,кинкга: " + namebook);
    }


}
