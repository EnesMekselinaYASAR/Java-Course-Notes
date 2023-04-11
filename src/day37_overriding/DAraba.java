package day37_overriding;

public class DAraba {
    private void yakit(){
        System.out.println("tum arabalar yakit kullanir");
        /*
        Parent class dan override edilmesini istemediginiz methodlari private, static veya final yapabilirsiniz
         */
    }
    void marka() {
        System.out.println("tum arabalarin markasi vardir");
    }
    void motor(){
        System.out.println("tum arabalarin motoru vardir");
    }

}
