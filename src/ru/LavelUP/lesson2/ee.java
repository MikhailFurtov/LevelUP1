package ru.LavelUP.lesson2;

import java.util.Scanner;

/*
Призывная кампания
*/

public class ee {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int age =  scan.nextInt();
        String name = scan.nextLine();

        if (age>=18){
            if (age <= 28) {
                System.out.println(name + militaryCommissar);
            }
        }
    }
}
