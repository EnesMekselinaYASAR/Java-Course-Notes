package day30_Immutable_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C06_localDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat); // 2023-04-04T11:08:12.091260700

        System.out.println(tarihSaat.plusMonths(3).plusHours(100)); // 2023-07-08T15:11:44.754006500

        System.out.println(tarihSaat.minusDays(100).plusHours(100)); // 2022-12-29T15:13:29.398907400

        System.out.println(tarihSaat.toLocalDate()); // 2023-04-04



    }
}
