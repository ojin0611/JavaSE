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
		System.out.print("좋아하는 계절(spring/summer/fall/winter) : ");
		String season = scan.nextLine();
		
		String flowers = (season.equals("spring")) ? "개나리, 진달래" :
			(season.equals("summer")) ? "장미, 아카시아" :
			(season.equals("fall"))   ? "백합, 코스모스" :
			(season.equals("winter")) ? "동백, 매화" : "error";

		System.out.printf("계절 : %s\n", season);
		System.out.printf("꽃 : %s", flowers);

	}
}
