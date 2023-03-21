package day10_stringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";

        System.out.println(str.length()); // str'in karakter sayisini dondurur.

        System.out.println(str.charAt(str.length()-1));

        System.out.println(str.charAt(str.length()-3));


        /*
        Java'da null pointer (isaretleyici) bir deger degil,
        karsisina yazildigi variable'in hicbir deger almadiginin isaretcisidir.
         */

        String str2=""; // str2'ye bir deger atanmıs mıdır EVET
                        // bu deger nedir: hiclik
        System.out.println(str2.length()); // 0

        String str3=null; //str3'e bir deger atamis midir HAYIR
                            // null bu deger atamamayi isaret etmektedir

        System.out.println(str3.length()); // bir deger atanmamis ki nasil uzunlugu olsun ?
                                            // NullPointerException olarak hata verir.

    }
}
