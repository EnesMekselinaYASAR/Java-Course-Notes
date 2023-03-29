package day21_Arrays;

import java.util.Arrays;

public class C09_BinarySearch {
    public static void main(String[] args) {

        /*
        BinarySearch Method'u siralanmis array'de aradigimiz elementin index'ini dondurur.
        Ya aradigimiz element array'de yoksa?
        (String'de index of bize olmayan elementler icin -1 donduruyordu.)
        ** Arradigimiz element array'de yoksa java hem olmadigini,
        hem de olsaydi nerede olacagini bize dondurur.
        *** olmadigi icin - kullanir.
        **** olsaydi nerede olacagini belirtmek icin index degil siralama kullanir.
         */


        int[] sayilar={3,5,1,4,7,0};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); // [0, 1, 3, 4, 5, 7]

        // varsa index, yoksa -sira

        System.out.println(Arrays.binarySearch(sayilar,1)); // 1

        System.out.println(Arrays.binarySearch(sayilar,5)); // 4

        System.out.println(Arrays.binarySearch(sayilar,10)); // -7

        System.out.println(Arrays.binarySearch(sayilar,6)); // -6

        System.out.println(Arrays.binarySearch(sayilar,-100)); // -1


    }
}
