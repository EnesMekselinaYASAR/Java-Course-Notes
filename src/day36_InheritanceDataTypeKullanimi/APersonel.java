package day36_InheritanceDataTypeKullanimi;

public class APersonel {

    String isim="Isim belirtilmedi";
    String soyIsim="SoyIsim belirtilmedi";
    String departman="Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personel maas alir");
    }

    protected void sigorta(){
        System.out.println("Tum personele sigorta yapilir");
    }
}
