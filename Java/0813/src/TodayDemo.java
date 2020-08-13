import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TodayDemo {
	public static void main(String[] args) {
		// DateFormat
		DateFormat df = DateFormat.getDateTimeInstance(
				DateFormat.FULL, DateFormat.FULL, Locale.KOREAN);
		System.out.println(df.format(new Date()));
		
		// SimpleDateFormat
		String pattern = "������ GG yyyy�� MM�� dd�� aa hh�� mm�� ss���Դϴ�.";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		// printf
		System.out.printf("������ %1$ty�� %1$tm�� %1$tm�� %1$td���Դϴ�.", new Date());
	}
}
