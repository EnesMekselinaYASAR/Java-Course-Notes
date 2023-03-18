package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String str="Java Cok guzel";
        str.toUpperCase();

        int sayi=10;
        // primitive data turlerinin yaninda method'lar olmaz
        // Java bazi method'lari kullanabilmemiz için
        // her bir primitive dara turu için bir wrapper class olusturmustur.

        Integer sayi2=10;

        sayi2.byteValue();
    }
}
