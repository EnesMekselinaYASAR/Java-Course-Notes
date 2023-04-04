package day31_timeFormatter_varargs;

public class C02_varargs {
    public static void main(String[] args) {

         /*
        Verilen 2 int'i toplayip sonucu yazdiran bir method olusturun
         */

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;

        ToplaYazdir(sayi1,sayi2,sayi3,sayi4);


    }

    public static void ToplaYazdir(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("Verilen 4 sayinin toplami : "+(sayi1+sayi2+sayi3+sayi4));
    }

    public static void ToplaYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println("Verilen 3 sayinin toplami : "+(sayi1+sayi2+sayi3));
    }

    public static void ToplaYazdir(int sayi1, int sayi2) {

        System.out.println("Verilen iki sayinin toplami : "+(sayi1+sayi2));
    }
}
