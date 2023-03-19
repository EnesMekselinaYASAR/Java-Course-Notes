package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<0){
            System.out.println("Lutfen gecerli bir yas yaziniz");
        } else if(yas<65){
            System.out.println("emekli olamazsin," + (65-yas)+" yil daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");
        }
    }
}
