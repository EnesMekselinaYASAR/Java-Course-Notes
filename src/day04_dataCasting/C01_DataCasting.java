package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf ='a';
        char yeniHarf=(char) (harf+1); // kod bu durumda önce sağdaki işlemi yapar.
                              // char yeniHarf =97+1--> 98
                              // char bir variable 98 olamayacağı için Java hata verir.
        System.out.println(yeniHarf);

        int sayi1=(int)7.3;
        System.out.println("sayi1=" + sayi1);

        double sayi2=10;
        System.out.println("sayi2=" +sayi2);

        int sayi3='c';
        System.out.println("sayi3="+sayi3);

        char harf2= 98;
        System.out.println("harf2="+harf2);
    }
}
