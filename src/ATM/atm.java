package ATM;
import java.util.Scanner;
public class atm {
    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int heart = 3; //kalan canimiz.
        int balance = 10; //bankadaki paramiz.
        int select;
        int money=0;
        Boolean logout = true;
        System.out.println("-----Gringotts Bankasına Hosgeldiniz------");

        do {
            //kullanici adi ve sifre girme
            System.out.println("Lutfen kullanici adi giriniz:");
            userName = inp.nextLine();
            System.out.println("Lutfen sifre giriniz:");
            password = inp.nextLine();


            //sifre ve kullanici adi kontrolu
            if (userName.equals("Nese") && password.equals("kod123")) { //eslesmesi kontrol edildi.
                System.out.println("Giris Basarili.");
                if (logout) {

                    //islem secimi
                    System.out.println("Lutfen yapmak istediginiz islemi seciniz: ");
                    System.out.println(" 1-Para Yatırma\n 2-Para Cekme\n 3-Bakiye Sorgulama\n 4-Cikis Yap ");
                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Lutfen yatirmak istediginiz miktari giriniz. ");
                            money = inp.nextInt();
                            balance += money;
                            System.out.println("Hesabinizdaki yeni miktar: " + balance);

                            break;
                        case 2:
                            System.out.println("Lutfen cekmek istediginiz miktari giriniz. ");
                            if (money > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= money;
                            }
                            System.out.println("Hesabinizdaki guncel miktar: " + balance);
                            break;
                        case 3:
                            System.out.println("Guncel bakiyeniz :  " + balance);
                            break;
                        case 4:
                            System.out.println("Cikis yaptiniz.  ");
                            logout = false;
                            break;
                        default:
                            System.out.println("Hatali giris yaptiniz.");
                            break;
                    }
                }

                } else {
                    heart--;
                    System.out.println("Hatalı kullanıcı adı veya şifre. Kalan hakkınız : " + heart);
                }
                if (heart == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }

        } while(heart>0 && logout);
    }

}

