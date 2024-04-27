package Casting;
import java.util.Scanner;

public class casting {
    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir tam sayi girin: ");
        int IntSayi = inp.nextInt(); //int olarak girdi aldik.
        double myDouble = IntSayi; //double'a çevirdik.

        System.out.println("Bir ondalikili sayi girin: ");
        double doubleSayi = inp.nextDouble(); //double olarak girdi aldik.
        int myInt = (int) doubleSayi; //int'e cevirdik.

        System.out.println("Girdiginiz tam sayi ondalikli sayiya donustu: "+myDouble);
        System.out.println("Girdiginiz ondalikli sayi tam sayiya donustu: "+myInt);

    }
}
