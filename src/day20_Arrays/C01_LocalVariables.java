package day20_Arrays;

public class C01_LocalVariables {
    public static void main(String[] args) {
        int sayi = 10;

        /*
        System.out.println(sayiMethod); SayiMethod sayiMethod method1'de olusturulmus
        local variable'dir.
         */

        for (int i = 0; i <20 ; i++) {
            System.out.println("i = " + i);
        }

        /*
        System.out.println(i); i loop'da olusturulmus local variable'dir.
        sadece loop icerisinde kullanilabilir.
         */

        /*
         static int sayiStatic = 20; Static keyword sadece class level'da kullanilabilir.
        method'larin icerisinde static variable TANIMLANAMAZ.
         */
    }

    public static void method(){
    /*
     System.out.println(sayi); sayi main method'da olusturulmus local bir
     variable'dir ve sadece main method'da gecerlidir.
     */
        int sayiMethod=20;

    }



}
