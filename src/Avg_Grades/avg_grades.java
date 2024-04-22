package Avg_Grades;
import java.util.Scanner;
public class avg_grades {
    public static void main(String[] args) {

    Scanner input = new Scanner (System.in);
    double matVize,fizVize,kimyaVize,turkceVize,tarihVize,muzikVize;
    double matFinal,fizFinal,kimyaFinal,turkceFinal,tarihFinal,muzFinal;

        System.out.println("Matematik vize notunu giriniz: ");
        matVize = input.nextDouble();

        System.out.println("Fizik vize notunu giriniz: ");
        fizVize = input.nextDouble();

        System.out.println("Kimya vize notunu giriniz: ");
        kimyaVize = input.nextDouble();

         System.out.println("Turkce vize notunu giriniz: ");
        turkceVize = input.nextDouble();

        System.out.println("Tarih vize notunu giriniz: ");
        tarihVize = input.nextDouble();

        System.out.println("Muzik vize notunu giriniz: ");
        muzikVize = input.nextDouble();

        //

        System.out.println("Matematik final notunu giriniz: ");
        matFinal = input.nextDouble();

        System.out.println("Fizik final notunu giriniz: ");
        fizFinal = input.nextDouble();

        System.out.println("Kimya final notunu giriniz: ");
        kimyaFinal = input.nextDouble();

        System.out.println("Turkce final notunu giriniz: ");
        turkceFinal = input.nextDouble();

        System.out.println("Tarih final notunu giriniz: ");
        tarihFinal= input.nextDouble();

        System.out.println("Muzik final notunu giriniz: ");
        muzFinal = input.nextDouble();

        double matAvg = (matVize + matFinal) / 2;
        double fizAvg = (fizVize + fizFinal) / 2;
        double kimyaAvg = (kimyaVize + kimyaFinal) / 2;
        double turAvg = (turkceVize + turkceFinal) / 2;
        double tarihAvg = (tarihVize + tarihFinal) / 2;
        double muzAvg = (muzikVize + muzFinal) / 2;

        System.out.println("Matematik ortalama: " +matAvg);
        if (matAvg > 60) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }

        System.out.println("Matematik ortalama: " +matAvg);
        if (fizAvg > 60) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }

        System.out.println("Matematik ortalama: " +matAvg);
        if (kimyaAvg > 60) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }

        System.out.println("Matematik ortalama: " +matAvg);
        if (turAvg > 60) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }

        System.out.println("Matematik ortalama: " +matAvg);
        if (tarihAvg > 60) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }

        System.out.println("Matematik ortalama: " +matAvg);
        if (muzAvg > 60) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }






    }
}



