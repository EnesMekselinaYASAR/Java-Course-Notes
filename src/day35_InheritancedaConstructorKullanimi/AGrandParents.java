package day35_InheritancedaConstructorKullanimi;

public class AGrandParents {

    protected String isim="Grandpa ismi belirtilmedi";

    /*
    Her class'ta gorunmese de bir constructor vardir.
    Bu class'dan obje olusturmak istedigimizde default constructor devreye girecektir.
    Default constructor'i gozlemleyemeyecegimiz icin onun yerin kullanılabilicek
    parametresiz constructor olusturalim.
    */

    protected String grandpaKlupAdi="Grandpa klubu";

    AGrandParents(){
        System.out.println("grandpa constructor calisti");
    }











}
