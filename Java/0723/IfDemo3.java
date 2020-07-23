/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class IfDemo3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연도 : ");
		int year = scan.nextInt();

		System.out.printf("%d년은 ", year);
		if (year % 4 == 0 & (year%400==0 | year%100>0) ){
			System.out.println("윤년입니다");
		}
		else System.out.println("윤년이 아닙니다");

	}
}
