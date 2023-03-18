package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        //kulllanıcıdan iki sayı alıp çarpımını yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen ilk sayiyi girin");

        double sayi1=scan.nextDouble();

        System.out.println("Lütfen ikinci sayiyi girin");

        double sayi2=scan.nextDouble();

        System.out.println("Girilen sayilarin carpimi:"+sayi1*sayi2);
    }
}
