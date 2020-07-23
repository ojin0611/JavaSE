/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class IfDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int number = scan.nextInt();
		
		System.out.print(number);
		if (number % 2 == 0){
			System.out.println("는 짝수입니다.");
		} else {
			System.out.println("는 홀수입니다.");
		}


	}
}
