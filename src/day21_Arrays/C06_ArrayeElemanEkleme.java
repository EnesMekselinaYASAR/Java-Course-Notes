package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {

        /*
        C05'deki methodu kullanarak array'e eleman ekleyelim.
         */

        String[] takimlist={"Suleyman","Osman"};
        String eklenecekIsim="Talha";

       takimlist= C05_ArrayeElementEkleme.elemanEkle(takimlist,eklenecekIsim);

        System.out.println(Arrays.toString(takimlist));


    }
}
