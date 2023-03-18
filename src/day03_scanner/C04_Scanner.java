package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanicidan ismini isteyin,
        // girilen ismi
        // isminiz: ismail şeklinde yazdiralim.

        //insanlarin dunyasindan kod'larimizin bulunduğu class'a değer almak için
        //scanner class ını kullanırız.

        //1-Scanner objesi oluşturalim.

        Scanner scan =new Scanner(System.in);

        //2-Kullanıcıya ne istediğimizi söyleyelim.

        System.out.println("Lütfen isminizi giriniz");

        //3- oluşturduğumuz scan objesi ile kullanıcının girdiği değeri alip
        // oluşturacağımız uygun bir variable'a atayalım.

        String kullaniciIsmi= scan.next();
        System.out.println("isminiz:"+kullaniciIsmi);


    }
}
