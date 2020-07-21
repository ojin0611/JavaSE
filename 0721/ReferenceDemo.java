/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

/*
	Class
	Object
	Instance
*/

public class ReferenceDemo {
	public static void main(String[] args) {
		Car sonata; // 선언
		sonata = new Car(); //4바이트짜리 주소 stack에 생성.
		sonata.name = "소나타"; // heap에 있는 sonata의 값에 할당
		sonata.price = 25_000_000;  // 자바에만 있는 숫자 표현 방식
		sonata.maker = "현대";

		Car carnival = new Car();
		carnival.name = "카니발";
		carnival.price = 35_000_000;
		carnival.maker = "기아";

		System.out.printf("이름 = %s, 가격 = %d, 제조사 = %s\n",
			sonata.name, sonata.price, sonata.maker);
		System.out.printf("이름 = %s, 가격 = %d, 제조사 = %s\n",
			carnival.name, carnival.price, carnival.maker);
	}
}

class Car {
	String name;
	int price;
	String maker;
}