package ExponentialNumbers;

import java.util.Scanner;

public class exponumbers {
    public static void main(String[] Args){
        Scanner inp = new Scanner(System.in);
        int num1,num2,i; //num1 ^ num2
        int calculation=1;

        System.out.println("ilk sayiyi giriniz: "); //n faktoriyel icin giris.
        num1 = inp.nextInt();
        System.out.println("ikinci sayiyi giriniz: "); //n faktoriyel icin giris.
        num2 = inp.nextInt();

        for(i=1; i<= num2; i++){ //üssü kadar for dongusu

            calculation *= num1;
        }
        System.out.println("Sonuc : "+calculation);
    }
}
