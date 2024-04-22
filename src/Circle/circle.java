package Circle;

import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius,circumference,angle,area,slice;
        final double PI = 3.14;

        System.out.println("Dairenin yarıcapını giriniz: ");
        radius = input.nextDouble();

        System.out.println("Dairenin merkez acısını giriniz: ");
        angle =input.nextDouble();


        area = PI * radius * radius;
        slice = (PI*(radius*radius)*angle) / 360;
        circumference = 2* PI * radius;

        System.out.println("Dairenin " +angle+ "\bderece açılık diliminin alanı : "+slice);
        System.out.println("Dairenin cevresi : "+circumference);
        System.out.println("Dairenin alanı : "+area);




    }
}
