/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class ArrayDemo {
	public static void main(String[] args) {
		// Declaration
		int su;
		int [] array; // [] 추가하면 주소변수가 선언됨.
		
		// Creation 생성 (배열을 위한 단계)
		array = new int[4]; //new는 단항연산자! 우측에서 좌측 순서대로

		// Assignment
		su = 5;
		array[1] = 3;

		System.out.printf("%d %d\n",array[0], array[1]);

		//-------------------------------------------------
		// Declaration
		int [] array2;

		// Creation & Assignment
		// 배열에는 주소를 저장해야하기때문에, new로 heap에 배열을 생성하고 그 주소를 할당
		array2 = new int[]{3,4,5,6}; // [] 안에 비워놔
		System.out.println(array2[2]);

		//-------------------------------------------------
		// Declaration, Creation & Assignment --> initialize
		int[] array3 = {3,4,5,6}; // 같은 라인에 둬야한다.
		System.out.println(array3[3]);
		
		/*
		int[] array4;
		array4 = {3,4,5,6}; // error
		*/


	}
}
