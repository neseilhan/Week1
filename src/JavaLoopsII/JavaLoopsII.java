package JavaLoopsII;
import java.util.Scanner;
import java.io.*;

public class JavaLoopsII {
    public static void main(String[] Args)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(); //satir sayisini aldik.
        for(int i=0;i<t;i++){
            int a = in.nextInt(); //dizinin degiskenlerini basta donguyle aldik.
            int b = in.nextInt();
            int n = in.nextInt();

            // Seriyi olusturuyoruz.
            for (int j = 0; j < n; j++) { //0'dan n'e kadar a sayisi.
                int sonuc = a;
                for (int k = 0; k <= j; k++) { // ilk döngüyle 2nin üstlerini alıyoruz.
                    sonuc += Math.pow(2, k) * b; //a'nın üstüne dizi işlemini ekliyoruz.
                }
                System.out.print(sonuc + " ");
            }
            System.out.println();
        }

    }
}
