package EbobEkok2;
import java.util.Scanner;
public class ebob_ekok2 {
    public static void main(String[] Args){
        Scanner inp = new Scanner(System.in);
        int num1,num2;
        int ebob=1;
        int ekok=1;
        int i=1;

        System.out.println("Lutfen birinci sayiyi giriniz :");
        num1 = inp.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz :");
        num2 = inp.nextInt();

        while(i <= num1 && i<=num2){ //kucuk olan sayiya kadar dongu devam eder.
            if(num1%i ==0 && num2%i==0){ //en buyugunu bulana kadar iki sayinin da kalansiz bolenlerini ebob degiskenine atar
                ebob = i;
            }
            i++;
        }
        ekok = (num1*num2)/ebob;
        System.out.println("Bu sayilarin EBOB'u :"+ebob);
        System.out.println("Bu sayilarin EKOK'u :"+ekok);
    }
}
