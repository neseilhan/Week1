package Digits;
import java.util.Scanner;
public class digits {
    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        int num;
        int total=0;
        System.out.print("Sayı Giriniz :");
        num = inp.nextInt();

        while(num !=0 ){
            total += num%10; //elimizdeki sayinin her seferinde mod10 unun alınması ve toplama atilmasi.
            num /= 10; //basamak degismesi icin her dongude 10a bolunmesi.
        }
        System.out.print("Basamak toplamlari :"+total);

    }
}
