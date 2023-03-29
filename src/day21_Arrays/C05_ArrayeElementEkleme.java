package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
         */

        String[] sinifList={"Ali Can","Nida Yucedal", "Musa Yaman"};
        String eklenecekIsim="Murat Babayigit";

        sinifList=elemanEkle(sinifList,eklenecekIsim);
        System.out.println(Arrays.toString(sinifList));
    }

    public static String[] elemanEkle(String[] sinifList, String eklenecekIsim) {
        String[] yeniSinifList=new String[sinifList.length+1]; // [null, null]
        // eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum
        for (int i = 0; i < sinifList.length; i++) {
            yeniSinifList[i]=sinifList[i];
        }
        // oncelikle eski listedeki tum elemanlari yeni listeye tasidim
        yeniSinifList[yeniSinifList.length-1]=eklenecekIsim;
        // son index'e ise ekleencek ismi atadim.
        return yeniSinifList;
    }
}
