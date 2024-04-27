package PrimeNumber;

public class prime_numbers {
    public static void main(String[] Args) {

        for (int i = 2; i <= 100; i++) { //2den 100'e kadar olan sayilar
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; //sadece asal olanlari göstermesi için kontrol degiskeni ekledik.
//                    break;
                }
            }
            if (isPrime) { //sayi asalsa yazdir.
                System.out.print(i + " ");
            }
        }
    }
}
