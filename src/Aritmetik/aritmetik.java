package Aritmetik;
import java.util.Scanner;

public class aritmetik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1,sayi2,sayi3; //sayilar int olarak tanımlandı.

        System.out.println("sayi 1'i giriniz: "); //kullanıcıdan sayilari girmesini istiyoruz.
        sayi1 = input.nextInt();

        System.out.println("sayi 2'yi giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("sayi 3'ü giriniz: ");
        sayi3 = input.nextInt();

        double islem = (sayi1+sayi2*sayi3-sayi2); //bizim belirlediğimiz islem double tanımlandı.

        System.out.println("Verdiginiz sayilara göre (a+b*c-b) isleminin sonucu: "  +islem); //islem sonucunu yazdırıyoruz.

    }
}
