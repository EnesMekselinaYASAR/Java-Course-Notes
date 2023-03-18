package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=500;

        byte sayi2= (byte) sayi1;
        System.out.println(sayi2);

        /*
        geniş data türündeki değeri dar data türündeki variable'a atamak isterseniz
        Java sizin geniş data türündeki değerin dar data turunun
        sınırlarına uyup uymayacağını calistirana kadar bilemez
        ama Java Risk almaz
        Riski sıfıra indirmek için burada bir sorun olursa
        sorumluluğu kabul etmenizi bekler
        bunun için değerin önüne parantez içerisinde istediğimiz data turunu yazmamız yeterli

        Bu riski ustlendiğinizde; 3 durum oluşabilir:
        1-bizim değerimiz, dar kalıp değerlerine uugun olursa hiçbir kayıp olmadan cast olur.
        2-double bir sayiyi int'a cast etmek gibi durumlarda data kaybi yaşayabilirsiniz.
        3-geniş kalıptan değeri dar kalıba koyduğunuzda, sınırları aşan durumlarda veri başkalaşabilir.

         */
    }
}
