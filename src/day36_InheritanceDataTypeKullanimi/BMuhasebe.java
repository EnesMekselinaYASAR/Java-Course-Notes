package day36_InheritanceDataTypeKullanimi;

public class BMuhasebe extends APersonel{

    protected int saatUcreti=10;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Calisan min. :"+ (30*gunlukMesai*saatUcreti)+" tl maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Isteyen calisanlara %50 indirimli ozel sigorta yapilir");
    }


}
