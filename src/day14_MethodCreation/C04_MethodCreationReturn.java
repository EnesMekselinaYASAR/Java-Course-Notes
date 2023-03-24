package day14_MethodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {

          /*
        Verilen isim ve soyismin ilk harfi buyuk geriye kalanlari * olacak sekilde
        degistirip bize bu halini donduren bir method olusturun .
        Not : programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak
        istiyoruz.
         */

        String isim="Enes";
        String soyIsim="Bozkurt";

        String gizliIsım=isimGizle(isim,soyIsim);
        System.out.println(isim+ " "+ soyIsim);
        System.out.println(gizliIsım); // E*** B******
    }

    public static String isimGizle(String isim,String soyIsim){
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");

        return isim+" "+soyIsim;
    }
}
