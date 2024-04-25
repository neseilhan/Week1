package PowersofFourandFive;
import java.util.Scanner;

public class powers {
    public static void main(String[] Args){
        Scanner inp = new Scanner(System.in);
        int num;
        int i;

        System.out.println("Bir sayi giriniz: ");
        num = inp.nextInt();

        System.out.println("4'un kuvetleri: "); //4'un kuvvetlerini kontrol ediyoruz.
        for(i=1; i<= num; i*=4){
            System.out.println(i);
        }
        System.out.println("5'in kuvetleri: "); //5'in kuvvetlerini kontrol ediyoruz.
        for( i=1; i<= num; i*=5){
            System.out.println(i);

        }


    }

}
