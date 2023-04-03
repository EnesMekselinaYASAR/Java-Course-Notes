package day29_PassByValue_Immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_passByValue {
    public static void main(String[] args) {
        /*
        Bir list olusturalim iki ayri method'dan birinde sadece elemanlari degistirelim
        digerinde yeni bir list atayip ayni sayida yeni eleman ekleyelim.
        ve her iki method call'dan sonra kendi listemizi main method icerisinde
        kontrol edelim.
         */

        List<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("Ilk basta list : "+list); // Ilk basta list : [Ali, Veli, Can]
        elemanlariDegistir(list);
        System.out.println("eleman degistir methodundan sonra listimiz : "+list); // eleman degistir methodundan sonra listimiz : [Oguz, Murat, Fatih]

        listDegistir(list);

        System.out.println("listDegistir methodundan sonra list : "+list); // listDegistir methodundan sonra list : [Oguz, Murat, Fatih]

    }

    private static void listDegistir(List<String> list) {
        list=new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("listDegistir methodunda list : "+list); // listDegistir methodunda list : [Nutella, Cay, Cokokrem]

    }

    public static void elemanlariDegistir(List<String> list) {

        list.set(0,"Oguz");
        list.set(1,"Murat");
        list.set(2,"Fatih");
        System.out.println("eleman degistir methodundaki listimiz : "+list); // eleman degistir methodundaki listimiz : [Oguz, Murat, Fatih]
    }


}
