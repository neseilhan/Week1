package minMax2;
import java.util.Scanner;

public class minMax2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Hesaplanacak sayı adedini kullanıcıdan al:
        System.out.print("Hesaplanacak sayı adedini girin (n): ");
        int count = scanner.nextInt();

        System.out.print("1. sayi : ");
        double num = scanner.nextDouble();
        double min = num;
        double max = num;

        for (int i = 2; i <= count; i++) { //ilk sayi girildigi icn 2den baslar.
            System.out.print(+i+". sayi : ");
            num = scanner.nextDouble();

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }
        System.out.println("En kücük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

    }
}
