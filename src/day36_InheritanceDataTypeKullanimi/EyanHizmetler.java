package day36_InheritanceDataTypeKullanimi;

public class EyanHizmetler extends BMuhasebe{

    protected int saatUcreti=9;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Yan hizmetliler : "+ (30*gunlukMesai*saatUcreti)+" tl maas alir");
    }

    protected void issizlikSigorta(){
        System.out.println("Yan hizmetliler %30 indirimli issizlik sigortasi yaptirabilir");
    }

    public static void main(String[] args) {
        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai); // 9
        System.out.println(mmr1.saatUcreti); // 12
        mmr1.maas();
        mmr1.ozelSigorta();
        mmr1.sigorta(); // Personel
        System.out.println(mmr1.isim); // Personel
        System.out.println(mmr1.soyIsim); // Personel
        System.out.println(mmr1.departman); // Personel
    }
}
