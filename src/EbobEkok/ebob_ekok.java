package EbobEkok;
import java.util.Scanner;

public class ebob_ekok {
    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        int num1,num2;
        int ebob=1;
        int ekok=1;
        System.out.println("Lutfen birinci sayiyi giriniz :");
        num1 = inp.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz :");
        num2 = inp.nextInt();

        if(num1!=0 && num2!=0){   // iki sayının da 0 olmama kosulu.
            if(num1>num2 ){ //buyuk olan sayi num1 ise bütün bölenlerini kontrol ediyoruz.
                for(int i =1; i<=num1; i++){
                    if( num1%i==0 && num2 %i ==0){
                        ebob = i;
                    }
                }
            }
            if(num2>num1){ //buyuk olan sayi num2 ise bütün bölenlerini kontrol ediyoruz.
                for(int i =1; i<=num2; i++){
                    if( num1%i==0 && num2 %i ==0){ //num1 ve num2 yi kalansiz bölen sayilari aliyoruz.
                        ebob = i;
                    }
                }
            }
            System.out.println("Bu sayilarin EBOB'u :"+ebob);
            ekok = (num1*num2)/ebob;
            System.out.println("Bu sayilarin EKOK'u :"+ekok);


        }


    }
}
