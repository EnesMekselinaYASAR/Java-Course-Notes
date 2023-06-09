package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_arraydenListOlusturma {
    public static void main(String[] args) {
         /*
        icinde 200 tane 1000'den kucuk pozitif tam sayi olan bir list olusturun.
        Kullanicidan bir sayi isteyip listede var olup olmadigini kullaniciya yazalim.
         */

        Random rnd=new Random();
        int sayi=0;
        List<Integer> sayiListesi=new ArrayList<>();

        while (sayiListesi.size()<200){
            sayi= rnd.nextInt(1000);
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }
        // System.out.println(sayiListesi);

        boolean bildiMi=false;
        int tahminSayisi=0;
        Scanner scan=new Scanner(System.in);

        while(!bildiMi){
            System.out.println("Lutfen bir sayi tahmininde bulunun");
            sayi=scan.nextInt();
            if (sayiListesi.contains(sayi)){
                System.out.println("Tebrikler "+ tahminSayisi+" adet tahminde listeden bir sayi buldunuz");
                bildiMi=true;
            }else{
                System.out.println(tahminSayisi+ " adet tahminde bulundunuz ama hicbiri listede yok");
                tahminSayisi++;
            }
        }
    }
}
