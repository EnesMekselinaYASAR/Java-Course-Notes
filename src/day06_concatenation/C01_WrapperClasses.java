package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*
        Wrapper class javanın hazır methodları kullanabilmemz için
        primitive data turlerının herbırı ıcın actigi class'lardır.
         */

        String str="Java ile hayat ne guzel";

        System.out.println(str.toUpperCase()); //JAVA ILE HAYAT NE GUZEL

        boolean guzelMi=true;

        // guzelMi. boolean primitive oldugundan hazir method u bulunmuyor.

        Boolean buGuzelMi=true;
        buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String ogrNo="123456";

        //kullanicidan bir  sifre isteyin eger sifre sadece rakamlardan olusuyorsa kabul etmeyin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");

        String sifre=scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);

        System.out.println(sifre);
        System.out.println(sifreSayi);

         /*
        Wrapper Class'lar ileride kullanabilecegiimiz pek çok faydali hazır method içerir.
         */
    }
}
