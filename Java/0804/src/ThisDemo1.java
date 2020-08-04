/*
	1. this. --> 나의. 명시적으로 멤버변수나 멤버메소드 지칭 
	2. this  --> 나의 또다른 주소. return this 
	3. this()--> new없이 생성자가 생성자를 호출하는 방법

*/
public class ThisDemo1 {
	public static void main(String[] args) {
		Student chulsu = new Student(60);
		chulsu.print();
	}
}

