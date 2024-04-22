package Hypotenuse;
import java.util.Scanner;
public class hypotenuse {
    public static void main(String[] args) { // Heron yöntemiyle dik ücgen alanı hesaplama
        Scanner input =  new Scanner(System.in) ;
        int edge1,edge2,edge3;
        double sum,halfSum,a,area;

        System.out.println("1. kenarı giriniz: ");
        edge1 = input.nextInt();

        System.out.println("2. kenarı giriniz: ");
        edge2 = input.nextInt();

        System.out.println("3. kenarı giriniz: ");
        edge3 = input.nextInt();

        sum = edge1+edge2+edge3;
        halfSum = sum/2;
        a = halfSum * (halfSum-edge1) * (halfSum-edge2) * (halfSum-edge3);
        area = Math.sqrt(a); // karekök bulma islemi.

        System.out.println("Ucgenin alanı: " +area);

    }
}
