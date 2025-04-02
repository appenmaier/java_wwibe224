package model;

import java.time.LocalDate;

public class TimestampConverter {

   private static int year;
   private static int month;
   private static int dayOfMonth;
   private static int totalDays;
   private static int extraDays;
   private static int flag;
   private static int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   public static LocalDate convert(long timestamp) {
      totalDays = (int) (timestamp / 86_400_000);
      calculateYear();
      calculateMonth();
      calculateDayOfMonth();
      LocalDate date = LocalDate.of(year, month, dayOfMonth);
      return date;
   }

   private static void calculateDayOfMonth() {
      if (extraDays > 0) {
         dayOfMonth = extraDays;
      } else if (month == 2 && flag == 1) {
         dayOfMonth = 29;
      } else {
         dayOfMonth = daysOfMonth[month - 1];
      }
   }

   private static void calculateMonth() {
      month = 0;
      int index = 0;
      if (flag == 1) {
         while (true) {
            if (index == 1) {
               if (extraDays - 29 < 0) {
                  break;
               }
               month += 1;
               extraDays -= 29;
            } else {
               if (extraDays - daysOfMonth[index] < 0) {
                  break;
               }
               month += 1;
               extraDays -= daysOfMonth[index];
            }
            index += 1;
         }
      } else {
         while (true) {
            if (extraDays - daysOfMonth[index] < 0) {
               break;
            }
            month += 1;
            extraDays -= daysOfMonth[index];
            index += 1;
         }
      }
      if (extraDays > 0) {
         month += 1;
      }
   }

   private static void calculateYear() {
      year = 1970;
      while (true) {
         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            if (totalDays < 366) {
               break;
            }
            totalDays -= 366;
         } else {
            if (totalDays < 365) {
               break;
            }
            totalDays -= 365;
         }
         year++;
      }
      extraDays = totalDays + 1;
      if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
         flag = 1;
      }
   }

}
