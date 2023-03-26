package day17_NestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
         /*
        Kullanicidan toplanmak uzere sayilar alın
        sayilarin toplami 500'ü gecince (500 dahil)
        sayilarin toplamını ve kac sayi toplandigini
        şu şekilde yazdirin
        13 sayi girdiniz ve toplamlari 567
         */

        int toplam=0, sayi=0, sayac=0;
        Scanner scan=new Scanner(System.in);

        while(toplam<500){

            System.out.println("lutfen toplamak icin sayi girin");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        }

        System.out.println(sayac+" sayi giridiniz ve toplamlari: "+toplam);


    }
}
