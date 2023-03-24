package day14_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

         /*
    verilen uc basamaklı bir sayinin rakamlarini toplamıni yazdiran bir method olsuturalim
     */

        int input=123;
        rakamlariTopla(input);
    }
    public static void rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz "+ temp+" sayisinin rakamlar toplami "+rakamlarToplami);

    }
}
