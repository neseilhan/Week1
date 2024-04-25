package Leapyear;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] Args){
        Scanner inp = new Scanner(System.in);

        int year; //yili tanimladik.
        System.out.println("Lutfen bir yil giriniz: ");
        year = inp.nextInt(); //yil girisini aldik.dxc

        if(year%400==0){ //400'e tam bolunuyorsa artik yildir.
            System.out.println(+year+" bir artik yildir.");
        }
        else if(year%4==0 && year%100!=0){ //4'e tam bölünüyorsa ama 100'e tam bolunmuyorsa artik yildir.
            System.out.println(+year+" bir artik yildir.");
        }
        else { //geri kalan ihtimaller artik yil degildir.
            System.out.println(+year+" bir artik yil degildir.");
        }
    }
}
