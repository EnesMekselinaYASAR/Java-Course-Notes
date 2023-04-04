package day30_Immutable_Date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1=LocalTime.now();
        System.out.println(time1); // 10:36:09.084276300

        /*
        Bizim olusturdugumuz date ve time canli saat veya tarih degildir.
        LocalTime.now(); kullandigimiz satirda o anki tarih veya saati alip
        bizim variable'imiza store eder.
        time1 variable'inin degeri SABİTTİR.
         */

        Thread.sleep(3000); // 3 sn bekler alt satira gecer.
        time1=LocalTime.now();
        System.out.println(time1); //

        System.out.println(time1.getSecond());

        System.out.println(time1.plusSeconds(10000)); // 13:47:35.916245600

        System.out.println(time1.minusMinutes(200)); // 200 dk once

        System.out.println(time1.withHour(03)); // saat kismini 3 yapar


    }
}
