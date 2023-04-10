package day37_overriding;

public class FSupra extends EToyota{

    @Override
    void yakit(){
        System.out.println("supra benzin kullanir");
    }

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
