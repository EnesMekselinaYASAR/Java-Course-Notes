package day21_Arrays;

import java.util.Arrays;

public class C10_Split {
    public static void main(String[] args) {
         /*
        Split() bir array method'u degil, String method'udur.
        Ama array dondurdugu icin bu konuda anlatiyoruz.
        Split() ile herhangi bir String'i istedigimiz sekilde parcalara bolup
        bir array haline getiriyoruz.
         */

        String str="Java ne kadar guzel";
        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, ne, kadar, guzel]

        String[] kelimelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe)); // [Java ,  kadar guzel]

        String[] kelimelerE=str.split("e");
        System.out.println(Arrays.toString(kelimelerE)); // [Java n,  kadar guz, l]

        String[] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler)); //


    }
}
