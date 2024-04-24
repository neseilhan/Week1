package EventRecommendation;
import java.util.Scanner;

public class Event {
    public static void main(String[] Args){
        Scanner inp = new Scanner(System.in);
        double heat;
        System.out.println("Sicakligi giriniz: "); //kullanicidan sicaklik girdisini aliyoruz.
        heat = inp.nextDouble();

        if (heat <5){  //tek tek kosullar ve sonuclarini yazdiriyoruz.
            System.out.println("Kayak yapabilirsiniz.");
        }
         if (5< heat  && heat <= 15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
         if(15 < heat && heat <= 25){
            System.out.print("Piknige gidebilirsiniz.");
        }
         if (heat > 25){
            System.out.println("Yuzmeye gidebilirsiniz.");

        }
    }
}
