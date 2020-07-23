/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class Quest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		int su1 = scan.nextInt();

		System.out.print("두번째 수 : ");
		int su2 = scan.nextInt();

		System.out.print("연산자(+,-,*,/,%) : ");
		String op = scan.next();
		
		int ans;
		switch (op)
		{
		case "+": System.out.printf("\n%d %s %d = %d", su1, op, su2, su1+su2); break;
		case "-": System.out.printf("\n%d %s %d = %d", su1, op, su2, su1-su2); break;
		case "*": System.out.printf("\n%d %s %d = %d", su1, op, su2, su1*su2); break;
		case "/": System.out.printf("\n%d %s %d = %d", su1, op, su2, su1/su2); break;
		case "%": System.out.printf("\n%d %s %d = %d", su1, op, su2, su1%su2); break;
		default : System.out.print("\n잘못된 연산자입니다.");
		}
	}
}
