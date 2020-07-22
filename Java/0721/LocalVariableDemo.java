/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

/*
	지역변수 : locabl variable, stack variable, automatic variable, temporary viarable
	- 특정 메소드 혹은 특정 block에서 선언된 변수
	- 특정 메소드나 특정블록을 벗어나면 자동소멸되고, 이 영역 안으로 들어오면 자동생성
	- 반드시 사용하기전에 초기화해야한다.
*/
import java.util.Scanner;
public class LocalVariableDemo {
	public static void main(String[] args) {
		/*
		{
			int age=24;
		}
		System.out.println(age); // 지역변수는 {} 안에서만 활동
		*/
		double height; //지역변수
		Scanner scan; //지역변수, 선언 
		scan = new Scanner(System.in); // 생성
		System.out.print("키몇?");
		height = scan.nextDouble(); //초기화

		double inch = height / 2.54; //지역변수
		double feet = inch / 12;
		System.out.printf("%.1fcm는 %.1f피트, %.2f인치입니다.\n",
			height, feet, inch);
	}
}
