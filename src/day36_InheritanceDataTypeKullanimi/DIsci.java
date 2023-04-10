package day36_InheritanceDataTypeKullanimi;

import java.util.*;

public class DIsci extends BMuhasebe{
    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){
        System.out.println("Isciler : "+ (30*gunlukMesai*saatUcreti)+" tl maas alir");
    }

    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();

         /*
        Bir obje olusturulurken Data turu ve constructor ayni class'dan ise direk
        o class'a gidiyorduk.

        Eger data turu ve constructor farkli ise
        Obje constructor'in oldugu class'in objesidir.
        Ancak, bizden istenen ==> İsci class'indaki spesifik ozellikler degil
        Bir iscinin muhasebe class'indaki tum calisanlarla beraber saship oldugu
        genel ozellikleri yazdirir.
         */

        System.out.println(isc1.gunlukMesai); // M 8
        System.out.println(isc1.saatUcreti); // M 10
        isc1.maas(); // M
        isc1.ozelSigorta(); // M
        isc1.sigorta(); // Personel
        System.out.println(isc1.isim); // Personel
        System.out.println(isc1.soyIsim); // Personel
        System.out.println(isc1.departman); // Personel


        APersonel isc2=new DIsci();

        // System.out.println(isc2.gunlukMesai);
        // System.out.println(isc2.saatUcreti);
        isc2.maas(); // M
        // isc2.ozelSigorta(); // M
        isc2.sigorta(); // Personel
        System.out.println(isc2.isim); // Personel
        System.out.println(isc2.soyIsim); // Personel
        System.out.println(isc2.departman); // Personel

         /*
        --> Eger data turu olan class'da aradigimiz ozellik yoksa
        varsasn onun parent'ina gidebilir.
        ama child'a donus olmaz.
        --> Aradigi ozelligi bulamazsa CTE verir
         */

        List<String> list1 = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();

        /*
        Hepsi LinkedList olsa da;
        list1 --> list gibi davranir
        list2 --> Deque gibi davranir
        list3 --> Queue gibi davranir
         */


    }
}
