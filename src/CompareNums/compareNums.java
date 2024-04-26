package CompareNums;
import java.util.Scanner;

public class compareNums {
    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        int N;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.print("Kac adet sayi gireceksiniz?");
        N = inp.nextInt();

        for (int i=1; i<= N; i++){
            System.out.println(i+". sayiyi giriniz:"); //N tane sayi girisi
            int num = inp.nextInt();

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("En kucuk sayi: " + min);
        System.out.println("En buyuk sayi: " + max);
    }
}

