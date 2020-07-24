/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class TestReview {
	public static void main(String[] args) {
		// 0xff00 & 0x00ff
		// &, && 차이

		// boolean -> int

		// 4 < 5 < 6

		// print(5++), int a=10--

		// 3 / int(5.2)
		
		// & : 논리 연산자. 
		System.out.println(0xff00 & 0x00ff);  // 0
		// &&: 비트 연산자
		/*
		System.out.println(0xff00 && 0x00ff); // error
		System.out.println(5 && 7); //error
		*/

		int sum; //초기화 안하면 에러나는데, 초기화 하면 값이 잘 나옴.
		for (int i= 1; i<10; i+=2)
		{
			sum = i*2;
		}
		System.out.println("결과 : "+sum);
	}
}
