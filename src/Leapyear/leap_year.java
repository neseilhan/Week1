package Leapyear;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] Args){
        Scanner inp = new Scanner(System.in);

        int year;
        System.out.println("Lutfen bir yil giriniz: ");
        year = inp.nextInt();

        if(year%400==0){
            System.out.println(+year+" bir artik yildir.");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println(+year+" bir artik yildir.");
        }
        else {
            System.out.println(+year+" bir artik yil degildir.");
        }
    }
}
