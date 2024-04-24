package Horoscope;

import java.util.Scanner;

public class horoscope {
    public static void main(String[] Args){
        Scanner inp = new Scanner(System.in);
        int day,month;
        String burc=""; //Basta bos burc stringi tanımlıyoruz.
//        Boolean IsError = false;

        System.out.println("Bir ay girin :"); //kullanicidan ay ve gun alıyoruz.
        month = inp.nextInt();

        System.out.println("Bir gun girin :");
        day = inp.nextInt();

            if (month < 1 || month > 12) {   //Girilen ayin dogru aralikta oldugunu kontrol ediyoruz.
                System.out.println("Hatali bir ay girdiniz.");
            }
            if (day < 1 || day > 31) {   //Girilen ayin dogru aralikta oldugunu kontrol ediyoruz.
                System.out.println("Hatali bir gun girdiniz.");
            }

        if(month == 1){
            if(1<=day && day <=31){
                if(day<22){
                    burc = "Oğlak";
                }
                else {
                    burc = "Kova";
                }
            }
        }
        if(month == 2){
            if(1<=day && day <=31){
                if(day<22){
                    burc = "Kova";
                }
                else {
                    burc = "Balık";
                }
            }
        }
        if(month == 3){
            if(1<=day && day <=31){
                if(day<20){
                    burc = "Balık";
                }
                else {
                    burc = "Koç";
                }
            }
        }
        if(month == 4){
            if(1<=day && day <=31){
                if(day<21){
                    burc = "Koç";
                }
                else {
                    burc = "Boğa";
                }
            }
        }
        if(month == 5){
            if(1<=day && day <=31){
                if(day<22){
                    burc = "Boğa";
                }
                else {
                    burc = "İkizler";
                }
            }
        }
        if(month == 6){
            if(1<=day && day <=31){
                if(day<23){
                    burc = "İkizler";
                }
                else {
                    burc = "Yengec";
                }
            }
        }
        if(month == 7){
            if(1<=day && day <=31){
                if(day<23){
                    burc = "Yengec";
                }
                else {
                    burc = "Aslan";
                }
            }
        }
        if(month == 8){
            if(1<=day && day <=31){
                if(day<23){
                    burc = "Aslan";
                }
                else {
                    burc = "Basak";
                }
            }
        }
        if(month == 9){
            if(1<=day && day <=31){
                if(day<23){
                    burc = "Basak";
                }
                else {
                    burc = "Terazi";
                }
            }
        }
        if(month == 10){
            if(1<=day && day <=31){
                if(day<23){
                    burc = "Terazi";
                }
                else {
                    burc = "Akrep";
                }
            }
        }
        if(month == 11){
            if(1<=day && day <=31){
                if(day<23){
                    burc = "Akrep";
                }
                else {
                    burc = "Yay";
                }
            }
        }
        if(month == 12){
            if(1<=day && day <=31){
                if(day<22){
                    burc = "Yay";
                }
                else {
                    burc = "Oğlak";
                }
            }
        }
        System.out.println("Burcunuz: "+burc);

    }
}
