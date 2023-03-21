package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("a"));   // 5
        System.out.println(str.indexOf('g'));   // 6
        System.out.println(str.indexOf("t"));   // bana Integer donduruyor
                                                // int'de yok diye bir deger bulunmuyor
                                                // 0 dersek J'nin index'idir
                                                // - bir deger donerse biz atanan string'in str'da olmadigini anlariz
                                                // java -1 dondurmeyi tercih etmistir

        String str5="ashfgsjhdfkhaslkjghadkg";

        // str5'de p harfi var midir?
        if (str5.indexOf("=")==-1) {
            System.out.println("str5 de istenen karakter kullanilmamis");
        }else {
            System.out.println("str5 de istenen karakter kullanilmis");
        }

    }
}
