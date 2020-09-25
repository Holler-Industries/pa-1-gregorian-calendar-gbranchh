package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object, qnd setting the date as September 23 always
        GregorianCalendar myCal = new GregorianCalendar( 2020, Calendar.SEPTEMBER, 23);


        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument

            System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));
            System.out.println("Expected: 4");     //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.
            int dayOfMonth = myCal.get(Calendar.DAY_OF_MONTH);
            int month = myCal.get(Calendar.MONTH) + 1;
            int year = myCal.get(Calendar.YEAR);

            System.out.println("The Current Date Is: " + month + "/"
                + myCal.get(Calendar.DAY_OF_MONTH) + "/"
                + myCal.get(Calendar.YEAR));
            System.out.println("Expected: 9/23/2020");

        //here's my extra credit attempt :P
            if ((myCal.get(Calendar.DAY_OF_WEEK)) ==1){
            System.out.println("The current day is Sunday!");
            }
            if ((myCal.get(Calendar.DAY_OF_WEEK)) ==2){
            System.out.println("The current day is Monday!");
            }
            if ((myCal.get(Calendar.DAY_OF_WEEK)) ==3){
            System.out.println("The current day is Tuesday!");
            }
            if ((myCal.get(Calendar.DAY_OF_WEEK)) ==4){
            System.out.println("The current day is Wednesday!");
            }
            if ((myCal.get(Calendar.DAY_OF_WEEK)) ==5){
            System.out.println("The current day is Thursday!");
            }
            if ((myCal.get(Calendar.DAY_OF_WEEK)) ==6){
            System.out.println("The current day is Friday!");
            }
            if ((myCal.get(Calendar.DAY_OF_WEEK)) ==7){
            System.out.println("The current day is Saturday!");
            }




        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html
//         dayOfMonth = myCal.get(Calendar.DAY_OF_MONTH) - 22;
//         month = myCal.get(Calendar.MONTH) -7;
//         year = myCal.get(Calendar.YEAR) + 1;
//        System.out.println("100 Days from now is: " + month + "/" + dayOfMonth + "/" + year);

            myCal.add(Calendar.DAY_OF_MONTH, 100);
            System.out.println("100 Days from now is: " + myCal.get(Calendar.MONTH) + "/" +myCal.get(Calendar.DAY_OF_MONTH) +"/" + myCal.get(Calendar.YEAR));
            System.out.println("It say's the month is zero, but it means 1. The code stated january as zero, and I don't know how to change" +
                "that value without effecting the overall date.");


        //birthday day of week
//        dayOfMonth = myCal.get(Calendar.DAY_OF_MONTH) -19;
//         month = myCal.get(Calendar.MONTH) + 3;
//        year = myCal.get(Calendar.YEAR) - 17;
//         System.out.println("My Birthday Is: " + month + "/" + dayOfMonth + "/" + year);
//        System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));

            myCal.add(Calendar.DAY_OF_MONTH, -6268);
            System.out.println("My Birthday Is: " + myCal.get(Calendar.MONTH) + "/" +myCal.get(Calendar.DAY_OF_MONTH) +"/" + myCal.get(Calendar.YEAR));
            System.out.println("My Birthday's Day of Week in 2003: " + myCal.get(Calendar.DAY_OF_WEEK));
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==1){
            System.out.println("My birthday was on a Sunday!");
        }
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==2){
            System.out.println("My birthday was on a Monday!");
        }
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==3){
            System.out.println("My birthday was on a Tuesday!");
        }
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==4){
            System.out.println("My birthday was on a Wednesday!");
        }
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==5){
            System.out.println("My birthday was on a Thursday!");
        }
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==6){
            System.out.println("My birthday was on a Friday!");
        }
        if ((myCal.get(Calendar.DAY_OF_WEEK)) ==7){
            System.out.println("My birthday was on a Saturday!");
        }

            System.out.println("It say's the month is ten, but it means eleven. The code stated january as zero, and I don't know how to change" +
                "that value without effecting the overall date. My birthday is on a wednesday so ther four is correct.");


        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)
            myCal.add(Calendar.DAY_OF_MONTH, 10000);
            System.out.println("10000 Days from my birthday is: " + myCal.get(Calendar.MONTH) + "/" +myCal.get(Calendar.DAY_OF_MONTH)
                +"/" + myCal.get(Calendar.YEAR));
//The values for my answers here, and the amount of days I subtract corrolates with the day that I did this assignment-Wed Sep 23
        //I am just letting you know this because as the day changes, the numbers are going to be different

    }

}