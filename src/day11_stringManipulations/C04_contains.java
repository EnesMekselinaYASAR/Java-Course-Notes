package day11_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {

          /*
     Soru 2) Kullanicidan bir cumle isteyin.
     Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
    “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
     iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */


        String cumle="Java buyuk, dunya kucuk";
        cumle=cumle.toLowerCase();

        //requirements'te buyuk harf kucuk harf hassasiyeti hakkında bir sey soylenmemis
        // ikinci olarak da her iki kelimeyi de icerme durumu acıklanmamis
        // bu durumda gorevi bize kim verdiyse ona sormak lazim

        // ek requirements : ikisini de iceriyorsa "Karar ver buyuk mu yazdirayim kucuk mu?
        // case sensitive olmasin

        if (cumle.contains("kucuk")&& cumle.contains("buyuk")){
            System.out.println("Karar ver buyuk mu yazdirayim, kucuk mu?");
        }else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        }else if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("Cumle kucuk ya da buyuk icermiyor");

             /*
        Java degerler soldan saga ve yukarıdan asagı calıstıgı icin en sınırlandırıcı olanı
        en basa yazmamiz gerekiyor.
        yoksa yukarıdaki ornekteki gibi dogru calısmaz. cunku diger koda gecemez
         */

        }
    }
}
