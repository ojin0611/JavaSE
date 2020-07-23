/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class Quest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫째수 : ");
		int su1 = scan.nextInt();

		System.out.print("둘째수 : ");
		int su2 = scan.nextInt();

		System.out.print("셋째수 : ");
		int su3 = scan.nextInt();

		int max;
		if (su1 < su2) max = su2;
		else max = su1;

		if (max<su3) max = su3;
		

		System.out.printf("%d, %d, %d중에 가장 큰 수는 %d입니다.", su1, su2, su3, max);
	}
}
