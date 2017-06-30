import java.util.*;

/**
 * Created by User on 6/29/2017.
 */
public class CalendarTest {


    public static void main(String[] args) {

        /**
         * this test is to verify selected date is valid and weekday is showing correctly ot not
         *
          */

        weeksAndDatesValidationTest(22);

        /** this test is to test how many weekdays in a month
         *
         */


        System.out.println(howmanyWeekDays("monday"));


    }


    public static ArrayList<Integer> daysInaMonth() {
        ArrayList days = new ArrayList();
        for (int i = 1; i < 32; i++) {
            days.add(i);
        }
        return days;
    }

    public static void weeksAndDatesValidationTest(int date1) {

        String[] WeekDays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "saturday", "Sunday",
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "saturday", "Sunday",
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "saturday", "Sunday",
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "saturday", "Sunday"};

        if (date1 == 0) {
            System.out.println("Invalid Date - dates should start from 1 - 31");
        }
        if (date1 > 0 && date1 < 32) {
            System.out.println("Selected Date is " + daysInaMonth().get(date1 - 1));
            System.out.println("And day is " + WeekDays[date1 - 1]);
        } else if (date1 >= 32) {
            System.out.println("Invalid Date - dates should start from 1 - 31");
        }
    }

    public static int howmanyWeekDays(String string) {

        String[] WeekDays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "saturday", "Sunday",
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "saturday", "Sunday",
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "saturday", "Sunday",
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "saturday", "Sunday"};

        int count = 0;
        for (int i = 0; i < WeekDays.length; i++) {

            if ((WeekDays[i].equalsIgnoreCase(string))) {
                count++;
            }
        }
        return count;

    }
}







