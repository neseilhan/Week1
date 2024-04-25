package EvenNumbers;
import java.util.Scanner;

public class even_numbers {
    public static void main(String[] Args){
        Scanner inp = new Scanner(System.in);
        int num; //gerekli degiskenleri belirledik.
        int sum=0;
        int avg=0;
        int count=0;

        System.out.println("Bir sayi giriniz:"); //kullanicidan sayi girisi aldik.
        num = inp.nextInt();

        for (int i=1;  i<=num;  i++){ //kullanicinin verdigi sayi kadar 1 artarak dongu saglandi.
            if(i%3==0 && i%4==0){
                System.out.println("3 ve 4un kati sayilar: "+i);
                sum += i; //dongude 3 ve 4ün kati olan sayilari toplam degiskenine ekledik.
                count++; //sayac kac sayi dondugunu tutuyor.
            }

        }
        avg = (sum/count); //donen sayi kadar toplama bolundu ve ortalama alindi.
        System.out.println("3 ve 4un kati olan sayilarin ortalamasi: "+avg);

    }
}
