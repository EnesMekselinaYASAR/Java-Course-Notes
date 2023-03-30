package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
         /*
        Elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
        istedigimiz yeni urunle degistirip eski urunu, varolan eski urunler
        listesine ekleyelim
        */

        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler=new ArrayList<>();
        /*
           listedeki ikram'in yerine biskrem koyalım,
           Ikram'ı da eski urunler listesine koyalım
        */

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp=urunler.indexOf(silinecekUrun);
        String silinenUrun= urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Liste :"+urunler);
        System.out.println("Eski urunler listesi :"+eskiUrunler);

        yeniUrun = "Kahve";
        silinecekUrun = "Cay";

        temp = urunler.indexOf(silinecekUrun);
        silinenUrun = urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler Listesi : " + urunler);
        System.out.println("Eski urunler Listesi : " + eskiUrunler);


        yeniUrun = "Fındık";
        silinecekUrun = "Cekirdek";

        temp = urunler.indexOf(silinecekUrun);
        silinenUrun = urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler Listesi : " + urunler);
        System.out.println("Eski urunler Listesi : " + eskiUrunler);



    }
}
