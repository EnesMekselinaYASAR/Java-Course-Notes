package day39_Exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) {

        String str;

        /*
        System.out.println(str);
        deger atamasi yapmadan bir variable'i kullanmaya calisirsaniz
        Java Comppile Time'da bunu farkeder ve size izin vermez
         */

        str=null;

        /*
        System.out.println(str.length());
        NullPointerException
         */

        Object obj="Java Java Java";
        Integer sayi=(Integer) obj; // ClassCastException

        /*
        String str2 = "Hava Civa";
        Integer sayi2 = str2;
        Java bazi casting islemlerine compile time'da izin vermez.
        Ancak bazen syntax uygun olabilir bu durumda java kodun calismasina itiraz etmez
         */

    }
}