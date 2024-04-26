package Star;
import java.util.Scanner;

public class Star {
    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayi girin.");
        int n = inp.nextInt();

        for(int i=0; i<= n; i++){
            for (int j =0; j<(n-i); j++){
                System.out.print(" ");  //yıldızların yanyana yazilmasi için println yerine print kullandik.
            }
            for(int k=1; k<=(2*i+1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=n-2; i>=0; i--){  //azalarak giden yıldızlar(ters üçgen)
            for (int j =0; j<(n-i); j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i+1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
