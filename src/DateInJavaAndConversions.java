import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  

public class DateInJavaAndConversions{
    
    public static void main(String[] args) {
        
        // date to String with DateFormat
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String strDate = dateFormat.format(date);
        System.out.println(strDate);

        // date from calendar (at midnight of the present day)
        Date dateFromCalendar = getDayBeginTime(date);
        System.out.println(dateFromCalendar);
    }

    private static Date getDayBeginTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        return new Date(calendar.getTime().getTime());
       }
}