package FlightTicket;

import java.util.Scanner;

public class flight_ticket {
    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        double km,Ucret,indirimliUcret,yasindirimi=0 ,ciftyonIndirimi;
        int yolculukTipi,yas;

        //yas, mesafe ve yolculuk tipi girisi alindi.
        System.out.println("Lutfen yas giriniz : ");
        yas = inp.nextInt();

        System.out.println("Lutfen mesafe giriniz (km cinsinden) : ");
        km = inp.nextDouble();

        System.out.println("Lutfen yolculuk tipi giriniz :\n 1-Tek Yon\n 2-Cift Yon");
        yolculukTipi = inp.nextInt();

        Ucret = km*0.10;  // Indirimsiz ucret hesaplandi.

        if(km>0 && yas>0) {
            //yas indirimi hesaplamasi yapildi.
            if (yas < 12) {
                yasindirimi = Ucret * 0.50;

            } else if (yas >= 12 && yas <= 24) {
                yasindirimi = Ucret * 0.10;

            } else if (yas >= 65) {
                yasindirimi = Ucret * 0.30;
            }
            indirimliUcret = Ucret - yasindirimi;

            switch (yolculukTipi) {
                //yolculuk tipine gore indirim hesaplandi.
                case 1:
                    System.out.println("Tek yon sectiniz. ");
                    System.out.println("Toplam tutar : "+indirimliUcret+"TL");
                    break;
                case 2:
                    System.out.println("Cift yon sectiniz. ");
                    ciftyonIndirimi = indirimliUcret * 0.2;
                    indirimliUcret = (indirimliUcret - ciftyonIndirimi) *2;
                    System.out.println("Toplam tutar : "+indirimliUcret+ "TL");
                    break;
                default:
                    System.out.println("Hatali yolculuk tipi girisi yaptiniz. ");
            }
        }
        else{
            System.out.println("Hatali yas ya da mesafe girisi yaptiniz.");
        }




    }
}
