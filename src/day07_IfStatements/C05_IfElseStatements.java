package day07_IfStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char harf=scan.next().charAt(0);

        if ((harf>='a' && harf<='z') || (harf>='A' && harf<='Z')){
            System.out.println("Girilen karakter bir harf");
        }
    }
}
