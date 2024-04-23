package UserLogin;
import java.util.Scanner;

public class userLogin {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);

        String username = "patika";
        String password = "java123";
        int select;

        System.out.println("Lutfen kullanici adi giriniz:");
        username = input.nextLine();
        System.out.println("Lutfen sifre giriniz:");
        password = input.nextLine();

        System.out.println("Giris yapiliyor...");

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Giris Basarili.");

        }
        else{
            System.out.println("Sifre veya kullanici adi hatali, sifrenizi sıfırlamak ister misiniz?\n 1-Evet\n 2-Hayir.");
            select = input.nextInt();


            switch (select){
                case 1:
                    System.out.println("Lutfen yeni sifreyi giriniz: ");
                    String newPassword = input.next();

                    String sonuc = ((newPassword.equals("java123")) ? "Yeni sifre bir oncekiyle ayni."  : "Yeni sifre olustu");
                    System.out.println(sonuc);

                    break;

                case 2:
                    System.out.print("Cikis yaptiniz.");
                    break;

                default:
                    System.out.println("Yanlis deger girdiniz.");

            }
        }
    }
}
