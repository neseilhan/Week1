package Harmonic;
import java.util.Scanner;

public class harmonic {
public static void  main(String[] Args){
Scanner inp = new Scanner(System.in);
double result=0;
System.out.println("Lutfen bir sayi griiniz: ");
int n = inp.nextInt();
for(double i=1; i<=n; i++){
    result = result + (1/i); //ya da result = result + (1.0/i) yazabiliriz.
}
    System.out.println("Harmonik sayilar toplamı: "+result);

}
}

