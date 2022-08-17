import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateEX {

	public static void main(String[] args) {
		LocalDate mydate = LocalDate.now();
		LocalTime myTime = LocalTime.now();
		LocalDateTime myDT = LocalDateTime.now();
		System.out.println(mydate);
		System.out.println(myTime);
		System.out.println(myDT);
		
		Date d = new Date();
		SimpleDateFormat S = new SimpleDateFormat("EEEE, y-M-d 'at' h:m:s a z");
		System.out.println(S.format(d));
		
		Calendar c = Calendar.getInstance();
		System.out.println(Calendar.DAY_OF_MONTH);

	}

}
