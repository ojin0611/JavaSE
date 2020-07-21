/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

/*
	클래스변수 (a.k.a static variable)
	- 클래스의 이름으로 접근한다!!
	- Integer.MAX_VALUE, short.MAX_VALUE, Byte.MAX_VALUE
	- 소속 클래스의 주소를 생성할 필요가 없다.
	- 자동으로 Data Type에 맞춰 초기값이 주어진다.
*/

public class StaticVariableDemo {
	static int age; // Class Variable, Static Variable. 공유 변수
	public static void main(String[] args) {
		/*
		//int age; 지역변수
		System.out.println("나이 =" + StaticVariableDemo.age); //자동으로 초기화됨.
		System.out.println("나이 =" + age); //이렇게 써도 컴파일러가 알아서 찾아줌.
		StaticVariableDemo svd = new StaticVariableDemo(); //이렇게도 되긴하는데 굳이
		System.out.println("나이 =" + svd.age);
		*/

		// System.out.println("가격 = " + price); //error. 다른클래스에 있다.

		Product.price = 2500_0000;
		System.out.println("가격 = " + Product.price); //error. 다른클래스에 있다.
	}
}

class Product {
	static int price;
}