package day30_Immutable_Date;

import java.time.LocalDate;
import java.time.Period;

public class C07_period {
    public static void main(String[] args) {
        /*
        İki tarih arasındaki sureyi bulma
         */

        LocalDate tarih=LocalDate.of(1995,6,29);
        LocalDate bugun=LocalDate.now();

        Period period=Period.between(tarih,bugun);

        System.out.println(period); // P-27Y-9M-5D

        System.out.println(period.getYears()); // 27
    }
}
