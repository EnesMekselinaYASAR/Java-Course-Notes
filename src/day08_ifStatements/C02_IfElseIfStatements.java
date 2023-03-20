package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
         /*
        Kullanıcıdan 100 üzerinden notunu isteyin.
        Not'u harf sistemine çevirip yazdırın.
        50'den kucukse "D",
        50-60 arasi"C",
        60-80 arası"B",
        80'nin uzerinde ise "A"
        Gecersiz not girildiginde uyarı verelim
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0'dan 100'e kadar bir not degeri girin");
         double note = scan.nextDouble();

        if (note < 0 || note > 100) {
            System.out.println("Lutfen gecerli bir not giriniz");
        } else if (note < 50) {
            System.out.println("Notunuz : D");
        } else if (note < 60) {
            System.out.println("Notunuz: C");
        } else if (note < 80) {
            System.out.println("Notunuz: B");
        } else {
            System.out.println("Notunuz A");
        }
    }
}