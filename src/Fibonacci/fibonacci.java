package Fibonacci;
import java.util.Scanner;

public class fibonacci{
    public static void main(String[] Args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int num = inp.nextInt();
        int a =0; //ardısık elemanları a ve b olarak tuttuk.
        int b= 1;
        for(int i =0; i<num; i++){
            System.out.print(a + " ");
            int toplam = a+b; //her dongude sayiyi bir sonrakiyle topla.
            a = b; //her dongude ardisik sayilar güncelleniyor.
            b=toplam;

        }
    }
}
