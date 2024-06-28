package amer.alaa.mohamed.DateFormatter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTester {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); // With getInstance() you don't need to use
        calendar.set(Calendar.YEAR,1970);
        calendar.set(Calendar.MONTH,Calendar.OCTOBER);
        calendar.set(Calendar.DATE,6);

        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat();
        String results=simpleDateFormat1.format(calendar.getTime());
        System.out.println(results);


        // new keyword
        Date now = new Date();
//        System.out.println(calendar.getCalendarType());
        System.out.println(now);
        int result = calendar.get(Calendar.DAY_OF_WEEK); //This the number of the day in the week like monday is number Three
        System.out.println(result);


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = simpleDateFormat.format(now);
        System.out.println(formattedDate);

    }
}
