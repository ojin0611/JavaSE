
public class ConstructorDemo1 {
	public static void main(String[] args) {
		Calendar today = new Calendar();
		System.out.println("year = "+today.year);
	}
	
}

class Calendar{
	int year, month, day;
	public Calendar() { // 생성자 재정의. Overriding the Default Constructor
		this.year = 2020;
		this.month = 8;
		this.day = 4;
	}
	
	public Calendar(int year, int month, int day) { // 기본생성자 overloading
		this.year = year;
		this.month = month;
		this.day = day;
	}
}
