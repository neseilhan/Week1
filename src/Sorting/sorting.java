package Sorting;
import java.util.Scanner;

public class sorting {
    public static void main(String[] Args) {
        Scanner inp = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("Lutfen 3 adet sayi giriniz.");
        System.out.println("1. sayi :");
        num1 = inp.nextDouble();
        System.out.println("2. sayi :");
        num2 = inp.nextDouble();
        System.out.println("3. sayi :");
        num3 = inp.nextDouble();

        if (num1 > num2 && num1 > num3 ) { //1'in en buyuk oldugu durum.
            if (num2 > num3) {
                System.out.println("Büyükten kücüge siralama su sekilde: " + num1 + " > " + num2 + " > " + num3);
            }
             else{
                    System.out.println("Büyükten kücüge siralama su sekilde: " + num1 + " > " + num3 + " > " + num2);
                }


        }
            else if (num2 > num3 && num2 > num1 ) { //2'nin en buyuk oldugu durum.
            if (num1 > num3) {
                System.out.println("Büyükten kücüge siralama su sekilde: " + num2 + " > " + num1 + " > " + num3);
            }
            else{
                System.out.println("Büyükten kücüge siralama su sekilde: " + num2 + " > " + num3 + " >" + num1);
            }

            }
            else if (num3 > num1 && num3 > num2){ //3'un en buyuk oldugu durum.
                if(num1>num2){
                    System.out.println("Büyükten kücüge siralama su sekilde: " + num3 + " > " + num1 + " > " + num2);
                }
                else{
                    System.out.println("Büyükten kücüge siralama su sekilde: " + num3 + " > " + num2 + " > " + num1);
                }



        }
    }
}
