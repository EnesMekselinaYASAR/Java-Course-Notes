package day28_StaticBlock;

public class C01_staticBlock {
    /*
        --> Static block class uyelerinin tamamindan once calisir.
        (Main method'dan bile once calisir.)
        --> Static block class olusturuldugunda calisir.
        Genellikle de class'la ilgili on ayarlamalar veya static variable'lara deger atamak
        icin kullanilir.
        --> Static block'larin class icerisinde nerede oldugu onemli değildir.
        once static block'lar calisir.
        --> Birden fazla static block varsa yukaridan asagi calisir.
         */

    static int sayi;
    static {
        System.out.println("static block calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);
    }

    static {
        System.out.println("main method altindaki static block calisti");
    }
}
