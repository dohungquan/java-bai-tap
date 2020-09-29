package BT5;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Date extends Person{

    Date(String firstName, String lastName, int day, int month, int year) {
        super(firstName, lastName, day, month, year);
    }



    public String daysOfWeek() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, getDay());
        cal.set(Calendar.MONTH, getMonth() - 1);
        cal.set(Calendar.YEAR, getYear());
        java.util.Date myBirth = cal.getTime();

        String daysinWeek = new SimpleDateFormat("EEEE").format(myBirth);
        return "(" + daysinWeek + ")";

    }


}
