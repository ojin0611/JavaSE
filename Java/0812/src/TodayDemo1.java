import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodayDemo1 {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR); // �ݳ�
		int month = cal.get(Calendar.MONTH) + 1 ;
		System.out.println("���� = " + year + "�� "+month+"��");
		
		
		Calendar cal2 = new GregorianCalendar(2020, 7, 1);
		int yoil = cal.get(Calendar.DAY_OF_WEEK); // �Ͽ���:1, �����:7
		System.out.println("�Ͽ����� 1, ���� ������ = "+yoil);
		
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println("�̹��� ������ �� = "+lastDay);
		
	}
}
