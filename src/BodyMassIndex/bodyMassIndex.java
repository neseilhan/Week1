package BodyMassIndex;
import java.util.Scanner;
public class bodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height,weight,bodyMassInd;


        System.out.println("Lütfen boyunuzu mt cinsinde giriniz (virgülle ayırınız): ");
        height = input.nextDouble();

        System.out.println("Lütfen kilonuzu (kg cinsinde) giriniz: ");
        weight = input.nextDouble();

        bodyMassInd = height / weight * weight;

        System.out.println("Vucut kitle endeksiniz: "+bodyMassInd);


    }
}
