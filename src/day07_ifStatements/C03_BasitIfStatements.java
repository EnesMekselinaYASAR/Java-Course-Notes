package day07_ifStatements;

public class C03_BasitIfStatements {
    public static void main(String[] args) {
/*
bir if statement'da { kullanılmazsa
Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur

Eger birden fazla satir ayni if sartina baglanmis ise mutlaka { kullanmaliyiz
 */

        int sayi = -23;

        if (sayi > 0) System.out.println("sayi pozitif");
        System.out.println("pozitif kalacaktir"); // { kullanılmazsa sart saglansa da saglanmasa da calisir.
        System.out.println("ücüncü satir");


        if (sayi % 2 == 0) System.out.println("sayi cift");
        System.out.println("cift kalacaktir"); // { kullanılmazsa sart saglansa da saglanmasa da calisir.

        if (sayi % 5 == 0) System.out.println("sayi 5'in tam kati");


    }
}
