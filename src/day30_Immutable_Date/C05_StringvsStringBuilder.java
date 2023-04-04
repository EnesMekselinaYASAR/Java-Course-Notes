package day30_Immutable_Date;

import java.time.LocalTime;

public class C05_StringvsStringBuilder {
    public static void main(String[] args) {

        /*
        String mi yoksa StringBuilder mi daha hizlidir?
        bunun için bir String olusturup, 1000 kere sonuna (.) ekleyelim,
        oncesinde ve sonrasinda zamani alip aradaki farki bulalım.
        Ayni islemi StringBuilder icin de yapalim.
         */

        LocalTime baslangic=LocalTime.now();
        String str="Ahhhh Java";
        for (int i = 0; i <10000 ; i++) {
            str+=".";
        }
        LocalTime bitis=LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println(bitis.getNano()- baslangic.getNano());

       baslangic=LocalTime.now();
        StringBuilder sb=new StringBuilder("Ahhhh Java");
        for (int i = 0; i <10000 ; i++) {
            sb.append(".");
        }
       bitis=LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println(bitis.getNano()- baslangic.getNano());



    }
}
