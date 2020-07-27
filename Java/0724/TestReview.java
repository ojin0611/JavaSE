/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class TestReview {
	public static void main(String[] args) {
		// & : 논리 연산자. 
		System.out.println(0xff00 & 0x00ff);  // 0
		// &&: 비트 연산자
		/*
		System.out.println(0xff00 && 0x00ff); // error
		System.out.println(5 && 7); //error
		*/

		int sum=0; //초기화 안하면(int sum;) 에러나는데, 초기화 하면 값이 잘 나옴.
		for (int i= 1; i<10; i+=2)
		{
			sum = i*2;
		}
		System.out.println("결과 : "+sum);

		// boolean -> int
		//System.out.printf("%d", true); error
		boolean myBoolean = false;
		int myInt = myBoolean ? 1 : 0;
		System.out.printf("%d\n\n",myInt);

		// 4 < 5 < 6
		System.out.println(4<5);
		// System.out.println(4<5<6); 컴파일 에러

		// 증감연산자 
		int a;
		int b=10;
		int c=10;
		a = b++; // a= 10;
		System.out.println(a +" "+b);
		a = ++c; // a= 11;
		System.out.println(a +" "+b);

	}
}
