/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : OS, Version, Editor
*/

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		/*
		System.out.print("귀하의 나이는? ");
		Scanner scan;
		scan = new Scanner(System.in);
		int age = scan.nextInt(); // 입력버퍼에서 한 개의 정수를 읽어들이는 함수
		System.out.println("귀하의 나이는 " + age + "살입니다.");
		System.out.printf("%d살이라니.. 늙은이\n", age);
		*/

		/*
		double height;
		double weight;

		Scanner scan; //주소 변수 선언
		scan = new Scanner(System.in); //주소 할당

		System.out.print("키 : ");
		height = scan.nextDouble(); //값 할당
		System.out.print("몸무게 : ");
		weight = scan.nextDouble(); //값 할당

		System.out.printf("키 = %.1fcm\t몸무게 = %.1fkg", height, weight, height);
		*/


		Scanner scan;
		scan = new Scanner(System.in);

		/*
		System.out.print("Name : ");

		String name; // 주소 변수 선언
		name = scan.next(); // 주소 변수 할당
		
		System.out.println("Hi "+name+"~!"); // 공백이 포함된 string을 입력하면 공백 이후가 끊긴다.
		*/
		
		System.out.print("주소? ");
		
		String wholeLine; 
		wholeLine = scan.nextLine(); // 이렇게 해야 한 줄 전체를 입력받는다.

		System.out.println("주소 : " +wholeLine);
	}
}
