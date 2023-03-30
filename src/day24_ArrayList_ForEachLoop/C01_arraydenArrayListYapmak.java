package day24_ArrayList_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_arraydenArrayListYapmak {
    public static void main(String[] args) {
        /*
        Uzun listeler olusturmamiz gerektiginde, tek tek eklemek yerine array olusturup
        bunlari list'e cevirmek daha pratik olabilir.
            1- loop ile array'deki tum elementleri list'e atabiliriz.
            2- Array.asList() kullanabiliriz.
                --> ancak bu method'un 2 tane kotu yan etkisi vardir.
                    **> Array class'i kullanildigi icin array ozellikleri gecerli olur
                    dolayisiyla list'te olan add, remove gibi size'i degistiren method'lar
                    bu sekilde olusturulan list'lerde kullanilmaz.
                    **> Kaynak olan array ile urun olan list ozdezlestirilir. birinde
                    yapilan degisiklik, otomatik olarak digerine de islenir.
         */

        String[] arr={"Ismail","Nurullah","Fatih"};

        List<String>sinifList= Arrays.asList(arr);
        System.out.println(sinifList);

        /*
         1. yan etki :
          sinifList.add("Erdi"); --> UnsupportedOperationException
          sinifList.remove(1); --> UnsupportedOperationException
         */

        /*
        2. yan etki :
         */

        arr[1]="Emre";
        System.out.println("degisim sonrasi array: "+ Arrays.toString(arr));
        System.out.println("degisim sonrasi List: "+ sinifList);

        sinifList.set(0,"Utku");
        System.out.println("List'i degistirince list: "+sinifList);
        System.out.println("list'i degistirince array: "+ Arrays.toString(arr));
    }
}
