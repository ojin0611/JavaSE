/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

import java.util.Scanner;

public class NewOpDemo {
	public static void main(String[] args) {
		Scanner scan = null; // 선언, 지역변수이자 참조변수
		scan = new Scanner(System.in);

		String irum = null;
		irum = new String("한지민");
		System.out.printf("이름 = %s\n", irum);

		irum = new String("김지민");
		System.out.printf("이름 = %s\n", irum);

		irum = "한"; // new String("한");
		irum = irum + "지민"; //irum + new String("지민"); ==> new String("한" + "지민")

	}
}
