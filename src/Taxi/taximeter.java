package Taxi;
import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {

        double km,total;
        Scanner input = new Scanner(System.in);

        System.out.println("Gidilen km'yi giriniz: ");
        km  = input.nextDouble();

        total= 10+(km*2.20);

        if(total <= 20){
            total=20;
        }
        else{
            total= 10+(km*2.20);
        }
        System.out.println("Toplam ücret: "+total);
    }
}
