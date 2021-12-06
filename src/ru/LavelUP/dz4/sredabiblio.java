package ru.LavelUP.dz4;

public class sredabiblio {
    public static void main(String[] args) {
        Reader petrov = new Reader("Петров Иван", 774516,"ФИТ", "01.05.1981","893413351");
        petrov.takeBook(4);
        petrov.takeBook("Моряк","Рыба");
        Book book1 = new Book("Новая", "Габриэль Фи");
        book1.Bookinfo();

    }


}
