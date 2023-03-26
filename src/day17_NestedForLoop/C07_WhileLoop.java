package day17_NestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        /*
        20'den 50'ye kadar cift sayilari yazdiralim. (Sınırlar dahil)
         */

        // for loop ile yapalim


        int bas=20, bitis=50;

        for (int i = 20; i <=50 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("");
        int temp=bas;
        while(temp<=bitis){
            if(temp%2==0){
                System.out.print(temp+" ");
            }
            temp++;
        }


    }
}
