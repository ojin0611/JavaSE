/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : OS= Windows 10, Version= OpenJDK14, Editor= EditPlus
*/
import java.util.Scanner;
public class Quest {
	public static void main(String[] args) {
		/*
		1. cm로 표현된 키를 피트와 인치로 변환. 
		1핕트는 12인치, 1인치는 2.54cm. 소수점 둘째자리
		
		163cm는 5피트, 4.17인치입니다.

		2. 원기둥의 부피 (소수점둘째)
		
		원기둥 밑면의 반지름 : 5
		원기둥 높이 : 50
		원기둥의 부피는 3926.99입니다.

		3. BMI지수(몸무게kg를 키의제곱m으로 나눈값)
		
		키 : 183.5
		몸무게 : 73.7
		귀하의 BMI지수는 21.88입니다.

		*/
		// 1.
		Scanner scan = new Scanner(System.in);
		double height;
		double feet = 2.54 * 12;
		double inch = 2.54;

		System.out.print("키 : ");
		height = scan.nextDouble();
		double tmp = height/feet;

		System.out.printf("%.0fcm는 %.0f피트, %.2f인치입니다.\n", 
			height, tmp, height/inch);

		// 2.
		System.out.print("원기둥 밑면의 반지름 : ");
		double r = scan.nextDouble();

		System.out.print("원기둥 높이 : ");
		double h = scan.nextDouble();
		
		double pi = 3.141592;
		System.out.printf("원기둥의 부피는 %.2f입니다.\n", r*r*h*pi);

		// 3.
		System.out.print("키 : ");

		height = scan.nextDouble() / 100;

		System.out.print("몸무게 : ");
		double weight = scan.nextDouble();
		double height_2;
		height_2 = height * height;
		System.out.printf("귀하의 BMI지수는 %.2f입니다.", weight / height_2);
	}
}
