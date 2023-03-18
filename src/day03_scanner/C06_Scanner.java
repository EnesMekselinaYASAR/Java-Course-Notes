package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {
        /* kullanicidan ismini, soyismini ve yasini alip
        girilen bilgiler = seyfi capar 34 seklinde yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        /*
        String verileri scanner ile alınırken
        next() : ilk boşluğa kadar olan kısmı (1 kelime) alir.
        nextLine(): satirin sonuna kadar ne yazrsak alir.
        NOT: Eğer art arda birden fazla string değer alacaksak nextLinekullanmalıyız.
         */
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi yaziniz");

        String soyisim=scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");

        double yas=scan.nextDouble();

        System.out.println("girilen bilgiler= "+isim+" "+soyisim+" "+yas);

    }
}
