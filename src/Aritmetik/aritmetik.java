package Aritmetik;
import java.util.Scanner;

public class aritmetik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1,sayi2,sayi3;

        System.out.println("sayi 1'i giriniz: ");
        sayi1 = input.nextInt();

        System.out.println("sayi 2'yi giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("sayi 3'ü giriniz: ");
        sayi3 = input.nextInt();

        double islem = (sayi1+sayi2*sayi3-sayi2);
        System.out.println("Verdiginiz sayilara göre (a+b*c-b) isleminin sonucu: "  +islem);

    }
}
