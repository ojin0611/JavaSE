/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class OpDemo5 {
	public static void main(String[] args) {
		/*
		byte a=5;
		//byte result= ~a; //~의 결과는 무조건 int기 때문에 byte result로 선언하면 에러생김
		int result = ~a;
		System.out.println("result = " + result);
		*/

		int a = 10;
		if ( 5 > 6 && a++ < 12){ // a=10
			System.out.print("true");
		}else{
			System.out.println("false");
		}
		System.out.print(a);
	}
}
