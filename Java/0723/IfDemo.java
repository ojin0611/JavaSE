/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class IfDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = scan.nextInt();

		//1.
		if (score>=60) {
			System.out.print("축");
			System.out.println("하");
		} else {
			System.out.print("쯧");	
		}
	}
}
