package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_timeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("Ilk olusturulan tarih : "+tarihSaat);
        // Ilk olusturulan tarih : 2023-04-04T16:18:57.840799200

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/M/yy  hh:mm");

        System.out.println(dtf1.format(tarihSaat)); // 04/4/23  04:20

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMM/yyyy  HH:mm a");

        System.out.println(dtf2.format(tarihSaat)); // 4/Nis/2023  16:22 ÖS






    }
}
