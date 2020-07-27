/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class ArrayDemo3 {
	public static void main(String[] args) {
		// 값변수의 배열은 값배열
		// 참조형의 배열은 주소배열
		String[] array = {"Hello","World","Java","Android","Python","Oracle"};
		Scanner scan = new Scanner(System.in);
		String yesno = null;
		do
		{
			int[] coin = {50000,10000,5000,1000,500,100,50,10,5,1};

			System.out.print("Money : ");
			int money = scan.nextInt();
			int remainder = money;
			for (int i=0; i < coin.length; i++)
			{
				System.out.printf("%5d원권 : %d\n", coin[i], remainder/coin[i]);
				remainder = remainder % coin[i];
			}
			System.out.print("Again? (y/n) : ");
			yesno = scan.next();
		}
		while (yesno.equals("y"));
	}
}
