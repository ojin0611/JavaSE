/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class ContinueDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String system_password = "1234";
		

		System.out.print("Enter a password : ");
		String user_password = scan.nextLine();

		int i = 0;
		for (; i<4 ;i++ ){
			if (system_password.charAt(i) == user_password.charAt(i))
			{
				continue;
			}
			else break;
		}
		if (i==4) System.out.println("Success");
		else System.out.println("Failure");
	}
}
