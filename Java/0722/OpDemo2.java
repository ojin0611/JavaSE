/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;

public class OpDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int first, second;
		System.out.print("첫번째 숫자 : ");  first = scan.nextInt(); //9
		System.out.print("두번째 숫자 : ");  second= scan.nextInt(); //4
		System.out.printf("%d + %d = %d\n",  first, second, first+second); //13
		System.out.printf("%d / %d = %d\n",  first, second, first/second); //2
		System.out.printf("%d %% %d = %d\n", first, second, first%second); //1
	}
}
