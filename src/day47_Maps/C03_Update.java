package day47_Maps;

import day46_Maps.ReusableMethods;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class C03_Update {
    public static void main(String[] args) {
         /*
        map.contains(key); ==> verdigimiz key'in map'de olup olmadigini boolean olarak doner
        map.contains(value); ==> bir butun olarak value'nin map'de olup olmadigini doner

        ONEMLİ NOT  : map.contains(value); value'nun icindeki bir parcayi bulmada ise yaramaz
                      eger value icindeki bir parcayi aratmak istiyorsak map uzerinde
                      manipulation yapmamiz lazim.

        map.get(key); ==> verilen key'e ait degeri dondurur.
         */
        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);
                 /*
                 {101=Ali, Can, JDev,
                 102=Enes, Cem, Tester,
                 103=Taha, Emre, JDev,
                 104=Derya, Deniz, Tester,
                 105=Enes, Can, Tester,
                 106=Taha, Deniz, JDev,
                 107=Derya, Cem, Tester}
                 */

        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); // false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true

        System.out.println(sinifListMap.containsValue("JDev")); // false

         /*
         Verilen mapde JDev yerine JavaDeveloper olarak degistirelim.
         Map'lerde replace tum value'yu degistirmek istersek kullanilabilir
         Kismi degisikliklerde kullanamayiz.
         */









    }
}
