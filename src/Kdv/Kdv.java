package Kdv;
import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double priceWithoutKdv,priceWithKdv,kdvRate;
        System.out.println("Kdv'siz fiyatı giriniz: ");
        priceWithoutKdv =input.nextDouble();


        if(priceWithoutKdv >= 1000 )
        {
            kdvRate = priceWithoutKdv*0.08;
        }
        else
        {
            kdvRate = priceWithoutKdv*0.18;
        }

        priceWithKdv = priceWithoutKdv + (kdvRate) ;


        System.out.println("Kdv oranı: " +kdvRate+" Kdv dahil fiyatı : "  +priceWithKdv);



    }
}