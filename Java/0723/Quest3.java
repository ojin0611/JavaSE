/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class Quest3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.nextLine();

		System.out.print("출생년도 : ");
		int year = scan.nextInt();
		String ddi = "";

		switch (year%12)
		{ 
		case 0: ddi = "원숭이"; break;
		case 1: ddi = "닭"; break;
		case 2: ddi = "개"; break;
		case 3: ddi = "돼지"; break;
		case 4: ddi = "쥐"; break;
		case 5: ddi = "소"; break;
		case 6: ddi = "호랑이"; break;
		case 7: ddi = "토끼"; break;
		case 8: ddi = "용"; break;
		case 9: ddi = "뱀"; break;
		case 10: ddi = "말"; break;
		case 11: ddi = "양"; break;
		default: break;
		}
		
		System.out.printf("%s님은 %d살이고, %s띠입니다.", name, 2020-year+1, ddi);
		// 12n = 원숭이
	}
}
