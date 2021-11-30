import java.util.Random;

public class dz2p3 {
    public static void main(String[] args) {
        Random r = new Random();
        int ch = r.nextInt(150)+5;
        System.out.println(ch);
        if (ch>=25 && ch<=100){
            System.out.println("Число в интервале от 25 до 100: "+ ch);
        }
        else {
            System.out.println("Число в не интервале от 25 до 100: " +ch);
        }
    }
}
