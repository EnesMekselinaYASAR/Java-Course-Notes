package day14_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {

          /*
       input olarak verilen isim ve soyismi
       ilk harfi buyuk geriye kalan harfler * olacak sekilde
       I***** K**** seklinde yazdiran bir method olusturun.
         */

        String isim="Enes";
        String soyIsim="Bozkurt";

        ismiGizle(isim,soyIsim);


    }

    public static void ismiGizle(String isim, String soyIsim) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");

        System.out.println(isim+" "+soyIsim);


    }
}
