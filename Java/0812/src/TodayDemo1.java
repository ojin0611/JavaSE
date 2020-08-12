import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodayDemo1 {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR); // 금년
		int month = cal.get(Calendar.MONTH) + 1 ;
		System.out.println("오늘 = " + year + "년 "+month+"월");
		
		
		Calendar cal2 = new GregorianCalendar(2020, 7, 1);
		int yoil = cal.get(Calendar.DAY_OF_WEEK); // 일요일:1, 토요일:7
		System.out.println("일요일은 1, 오늘 요일은 = "+yoil);
		
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println("이번달 마지막 날 = "+lastDay);
		
	}
}
