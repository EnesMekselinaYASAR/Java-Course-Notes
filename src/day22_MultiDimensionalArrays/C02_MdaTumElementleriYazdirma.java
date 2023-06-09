package day22_MultiDimensionalArrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {
        /*
        Verilen bir multi-dimensional array'in tum elementlerini yazdiran bir
        method olusturun.
         */
        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
        elementleriYazdir(sayilar);
    }
    public static void elementleriYazdir(int[][] sayilar) {
        for (int i = 0; i < sayilar.length ; i++) { // i=0,1,2 degerleri alacak
            for (int j = 0; j <sayilar[i].length ; j++) { // inner array lerin uzunluguna bagladik
                System.out.print(sayilar[i][j]+ " "); // 1 5 6 9 2 5 3 1 6
            }
        }
    }
}
