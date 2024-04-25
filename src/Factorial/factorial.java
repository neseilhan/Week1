package Factorial;
import java.util.Scanner;

public class factorial {
    public static void main(String[] Args)
    {
        Scanner inp = new Scanner(System.in);
        int n,r,i,j,k;
        int nFac=1; //faktoriyel hesaplarken sıkıntı olmaması icin basta 1 tanımlıyoruz.
        int rFac=1;
        int NminusRFac=1;
        int combination =0;

        System.out.println("N sayi giriniz: "); //n faktoriyel icin giris.
        n = inp.nextInt();

        System.out.println("R sayi giriniz: "); //r faktoriyel icin giris.
        r = inp.nextInt();

        for(i=1; i<=n; i++){ //n faktoriyel hesaplama
            nFac *= i;
//            System.out.println("n faktoriyel : "+nFac);
        }
        for(j=1; j<=r; j++){ //r faktoriyel hesaplama
            rFac *= j;
//            System.out.println("r faktoriyel : "+rFac);
        }
        for (k = 1; k <= n - r; k++) { // n-r faktoriyeli.
            NminusRFac *= k;
        }


        combination = (nFac)/(rFac*(NminusRFac)); //kombinasyon islemi.
        System.out.println("n ve r sayilarinin kombinasyonu : "+combination);

    }
}
