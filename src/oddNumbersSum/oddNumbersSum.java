package oddNumbersSum;
import java.util.Scanner;

public class oddNumbersSum {
    public static void main(String[] Args){
        Scanner inp = new Scanner(System.in);
        int num;
        int sum =0;

        do{
            System.out.println("Bir sayi giriniz: ");
            num = inp.nextInt();

            if( num%4==0 && num %2 == 0 ){ //2ve 4e kalansiz bolunen sayilari al ve toplam degiskenine at.
                sum += num;

            }

        }
        while(num%2==0); //cift oldugu durumda bu donguyu surdur.
        System.out.println("2 ve 4un kati olan sayilarin toplami: "+sum);

    }
}
