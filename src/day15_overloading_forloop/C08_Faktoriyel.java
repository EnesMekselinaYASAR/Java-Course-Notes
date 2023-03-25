package day15_overloading_forloop;

public class C08_Faktoriyel {
    public static void main(String[] args) {

        /*
        input olarak verilen bir tam sayi icin faktöriyel hesaplayip yazdiran
        bir method olusturun.
        verilen sayi negatif veya 20 den buyuk olursa
        "girilen sayinin faktöriyeli hesaplanamaz" uyarisi yazdirin
         */
        int input=6;
        faktoriyelHesaplama(input);
    }

    public static void faktoriyelHesaplama(int input) {

        int faktoriyel=1;

        if(input<0 || input>=20){
            System.out.println("Verilen sayi icin faktoriyel hesaplanamaz");
        }else if(input==0){
            System.out.println("0!=1'dir");
        }else{
            for (int i = 1; i <=input ; i++) {
                faktoriyel*=i;
            }
            System.out.println("faktoriyel degeri = " + faktoriyel);
        }
    }
}
