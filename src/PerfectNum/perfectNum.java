package PerfectNum;

import java.util.Scanner;

public class perfectNum {
    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        int num;
        int carpanlar=0;
        System.out.print("Bir sayi giriniz :"); //kullanicidan sayi girisi.
        num = inp.nextInt();

        for(int i =1; i<num; i++){ //Carpanlarina ayirmak icin sayinin kendisi haric döngü.
            if( num%i==0 ){
                carpanlar += i; //carpanları toplayip carpanlar degiskenine atiyoruz.
                System.out.println(i);
            }
        }
        if (carpanlar==num){ //carpanlar sayinin kendisini veriyorsa mükemmeldir.
            System.out.println(num+" Mukemmel sayidir.");
        }
        else{
            System.out.println(num+" Mukemmel sayi degildir.");
        }

    }
}
