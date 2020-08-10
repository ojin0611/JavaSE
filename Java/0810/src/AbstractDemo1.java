import java.util.Calendar;
import java.util.GregorianCalendar;

public class AbstractDemo1 {
	public static void main(String[] args) {
		// Calendar now = new Calendar(); // import하기 전에는 Calendar 둘다 빨간줄에러
		// import 하고나서는 뒤의 Calendar에만 에러가 생기는데, cannot instantiate 에러라면 abstract class이기때문이다.
		Calendar now = new GregorianCalendar();
	}
}
