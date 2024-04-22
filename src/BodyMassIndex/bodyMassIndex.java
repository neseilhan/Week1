package BodyMassIndex;
import java.util.Scanner;
public class bodyMassIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double height,weight,bodyMassInd; //boy kilo ve vucut endeksi double olarak tanımlandı.


        System.out.println("Lütfen boyunuzu mt cinsinde giriniz (virgülle ayırınız): "); //kullanıcıdan boy istendi.
        height = input.nextDouble();

        System.out.println("Lütfen kilonuzu (kg cinsinde) giriniz: "); //kullanıcıdan kilo istendi.
        weight = input.nextDouble();

        bodyMassInd = height / weight * weight; //vucut endeksi hesaplandı.

        System.out.println("Vucut kitle endeksiniz: "+bodyMassInd); //ekrana sonuc getirildi.


    }
}
