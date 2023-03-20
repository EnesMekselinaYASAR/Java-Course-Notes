package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        double sayi=scan.nextDouble();

        System.out.println(sayi>0 ? "sayi pozitif" : (sayi*sayi));
    }
}
