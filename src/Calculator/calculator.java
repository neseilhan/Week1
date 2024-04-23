package Calculator;
import java.util.Scanner;

public class calculator {
    public static  void  main(String[] Args){
        Scanner input = new Scanner(System.in);
        double number1,number2;
        int select;

        System.out.println("Lutfen 1. sayıyı giriniz: "); //kullanıcıdan boy istendi.
        number1 = input.nextDouble();
        System.out.println("Lutfen 2. sayıyı giriniz: "); //kullanıcıdan boy istendi.
        number2 = input.nextDouble();

        System.out.println("Lutfen yapmak istediginiz islemi giriniz:\n 1-Toplama\n 2-Cıkarma\n 3-Carpma\n 4-Bolme "); //kullanıcıdan boy istendi.
        select = input.nextInt();

        switch(select){ //her sayiya bir islem atandi ve ekrana yazdirildi.
            case 1:
                System.out.println(number1+number2);
                break;

            case 2:
                System.out.println(number1-number2);
                break;

            case 3:
                System.out.println(number1*number2);
                break;
            case 4:
                System.out.println(number1/number2);
                break;
            default:
                System.out.println("Girilen sayi gecersiz.");
                break;

        }


    }
}
