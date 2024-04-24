package Grades;
import java.util.Scanner;

public class grades {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        double mat, fiz, tur, kim, muz;
        double average;
        double sum=0;
        double classes=0;

        System.out.println("Matematik notunu giriniz");
        mat = input.nextDouble();

        System.out.println("Fizik notunu giriniz");
        fiz = input.nextDouble();

        System.out.println("Turkce notunu giriniz");
        tur = input.nextDouble();

        System.out.println("Kimya notunu giriniz");
        kim = input.nextDouble();

        System.out.println("Muzik notunu giriniz");
        muz = input.nextDouble();

        if(mat >0 && mat <=100){
        classes ++;
        sum += mat;
        }
         if (fiz >0 && fiz <=100){
            classes ++;
            sum += fiz;
         }
         if (tur >0 && tur <=100){
            classes ++;
            sum += tur;
        }
         if (kim >0 && kim <=100){
            classes ++;
            sum += kim;
        }
         if (muz >0 && muz <=100){
            classes ++;
            sum += muz;
        }
        average = (sum / classes);

        if(average >= 55){
            System.out.println("Gectiniz, ortalamanız: "+average);
        }
        else if(average < 55){
            System.out.println("Kaldiniz, ortalamanız:"+average);
        }



    }
}
