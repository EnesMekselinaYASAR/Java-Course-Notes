package day37_overriding;

public class FSupra extends EToyota{


    void yakit(){
        System.out.println("supra benzin kullanir");
    }

     /*
        Private method'lar override edilemez.
        Eger child class'da parent class'daki private method ile ayni signature'da
        bir method olusturursaniz bu overridding method OLMAZ.
         */

    @Override
    void motor() {
        System.out.println("sirali 6 silindir 232 motoru kullanir");
         /*
        --> @Override notasyonu Javaya bir gorev verir.
            Java, bu notasyonla birbirine bagli olan iki method'u surekli kontrol eder.
            Eger parent class'daki override method'u silerseniz CTE verir
        --> @Override notasyonu kullanmak mecburi değildir.
            Eger Overridding method silinirse, kodun CTE vermesini istersek
            @Override notasyonu kullanmaliyiz.
         */
    }
}
