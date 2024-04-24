package Zodiac;
import java.util.Scanner;

public class zodiac {
    public static void main(String[] Args){
        Scanner inp = new Scanner(System.in);
        int birthYear,birthYearMod;  //dogum yili ve modu alınmis  halini tanimladik.
        String zodiac=""; //burcu bos string olarak tanimladik.

        System.out.print("Lutfen dogum yilinizi giriniz:"); //dogum tarihi alma
        birthYear = inp.nextInt();

        birthYearMod = (birthYear%12); //dogum tarihinin modunu alma
        switch(birthYearMod){  //12 durum için 12 case
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Köpek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;

        }
        System.out.println("Cin zodyagi burcunuz : "+zodiac);

    }
}
