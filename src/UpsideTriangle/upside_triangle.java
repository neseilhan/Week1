package UpsideTriangle;
import java.util.Scanner;

public class upside_triangle {
    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:"); //kullanicidan sayi girisi.
        int num = inp.nextInt();

        for(int i=num; i>=0; i--){  //girilen sayidan baslayip azalarak inen yildizlar.

            for(int k=1; k<=(2*i-1); k++){ //1,3,5 seklinde giden yildizlar.
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
