package day25_Constructor;

public class C02_Constructor {
    public static void main(String[] args) {
        C01         obj1        =   new         C01();
        // Class adi -- objenin adi -- keyword -- constructor

        /*
        Java da bir obje olusturabilmek icin mutlaka constructor kullanmalisiniz.
         */

        System.out.println(obj1.sayi); // 0
        obj1.deneme(); // C01 den deneme metodu calisir
    }


}
