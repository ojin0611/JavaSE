import java.util.Date;
import java.util.Hashtable;

/*
 * 1. Date class
 * 
 */

public class TodayDemo {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now); // now.toString()
		
		String[] array = now.toString().split("\\s+");
		System.out.println(array[5]+"년 "
				+ getMonth(array[1])+"월 "
				+ array[2]+"일"); // 재구성
	}
	
	static int getMonth(String month) {
		Hashtable ht = new Hashtable(); // hashtable이라는 DB 생성
		ht.put("Jan",1);
		ht.put("Feb",2);
		ht.put("Mar",3);
		ht.put("Apr",4);
		ht.put("May",5);
		ht.put("Jun",6);
		ht.put("Jul",7);
		ht.put("Aug",8);
		ht.put("Sep",9);
		ht.put("Oct",10);
		ht.put("Nov",11);
		ht.put("Dec",12);
		
		return (Integer)ht.get(month);
	}
}
