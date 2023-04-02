package day28_StaticBlock;

public class C02_passByValue {
    public static void main(String[] args) {
        double satisFiyati = 100;

        System.out.println(indirimliFiyat(satisFiyati)); // 90
        System.out.println(satisFiyati); // 100
        System.out.println(indirimliFiyat(satisFiyati)); // 90

        /*
        İki farkli method'da satisFiyati isminde variable olabilir.
        Java buna itiraz etmez cunku scope'lari farklidir.
         */
    }

    public static double indirimliFiyat(double orijinalFiyat){
        /*
        Methodumuz %10 indirim yapip yeni fiyati main methoda dondürsün.
         */

        double satisFiyati=orijinalFiyat*0.9;

        return satisFiyati;

    }
}
