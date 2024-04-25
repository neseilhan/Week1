package Groceries;
import java.util.Scanner;
public class groceries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg,total;
        final double ARMUT = 2.14; //fiyatlarin sabit oldugunu dusunerek final ile ücret belirtildi.
        final double ELMA = 3.67;
        final double DOMATES = 1.11;
        final double MUZ = 0.95;
        final double PATLICAN = 5.00;

        System.out.println("Armut kac kilo?: "); //kullanicidan hangi meyveden kacar kilo aldigi istendi.
        armutKg = input.nextDouble();
        System.out.println("Elma kac kilo?: ");
        elmaKg = input.nextDouble();
        System.out.println("Domates kac kilo?: ");
        domatesKg = input.nextDouble();
        System.out.println("Muz kac kilo?: ");
        muzKg = input.nextDouble();
        System.out.println("Patlıcan kac kilo?: ");
        patlicanKg = input.nextDouble();

        total= (ARMUT*armutKg+ELMA*elmaKg+DOMATES*domatesKg+MUZ*muzKg+PATLICAN*patlicanKg); //toplam islemi yapildi .

        System.out.println("Toplam tutar: "+total+"TL");  //ekrana toplam ucret yazildi.





    }
}
