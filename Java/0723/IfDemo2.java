/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class IfDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("계절을 입력하세요 (봄/여름/가을/겨울) : ");
		String season = scan.nextLine();

		if (season.equals("봄") | season.equals("spring")){
			System.out.println("개나리, 진달래");
		} else if (season.equals("여름") | season.equals("summer")){
			System.out.println("장미, 아카시아");
		} else if (season.equals("가을") | season.equals("fall")){
			System.out.println("백합, 코스모스");
		} else if (season.equals("겨울") | season.equals("winter")){
			System.out.println("동백, 매화");
		} else System.out.println("시키는대로 합시다");
	}
}
