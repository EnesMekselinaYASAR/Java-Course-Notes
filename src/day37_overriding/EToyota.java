package day37_overriding;

public class EToyota extends DAraba{
    void marka() {
         /*
         super.marka();
         eger hem overridden hem de overridding method'un calismasini istersek
         ilk satira super.marka() yazabiliriz.
         */
        System.out.println("markamiz Toyota");
    }

    void motor(){
        System.out.println("Toyota araclar Toyota marka motor kullanir");
    }
}
