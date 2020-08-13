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
		String pattern = "지금은 GG yyyy년 MM월 dd일 aa hh시 mm분 ss초입니다.";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		// printf
		System.out.printf("오늘은 %1$ty년 %1$tm년 %1$tm월 %1$td일입니다.", new Date());
	}
}
