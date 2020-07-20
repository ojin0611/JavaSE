/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : OS, Version, Editor
*/

public class CharDemo {
	public static void main(String[] args) {
		System.out.println("오늘은 특별히 \"Java의 실수저장법\"에 대해서 학습했습니다.");

		String filepath = "C:\\ndrive\\temp\\reverse";
		System.out.println(filepath);

		filepath = "C:/ndriver/temp/reverse";
		System.out.println(filepath);

		int su   = 0222;
		char ch  = '\ucafe';
		char ga = 0xAC00;
		System.out.printf("su = %d\n",su);
		System.out.printf("ch = %c\n",ch);
		System.out.printf("ga = %c\n",ga);

	}
}
