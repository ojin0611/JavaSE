/*
작성자 : 
작성목적 :
작성일시 :
작성환경 : OS, Version, Editor
*/

public class LiteralDemo3 {
	public static void main(String[] args) {
		/*
		*/
		System.out.printf("%s\n", "서울시 어딘가 한독빌딩 8층"); // % 형식화된 출력이 필요할 때만 printf 사용
		System.out.println("부산시 "+"해운대구 " + "해운대 " + "해수욕장"); // concatenation
		System.out.println("부산시 "+ 123); // concatenation 양옆에 한개라도 문자열이 있으면, "부산시 " + "123"으로 자동 형변환된다.
		System.out.printf("%s\n", 120+24.68+"Hi"); // 좌측의 더하기가 우선이고 그 다음엔 string

		System.out.printf("%o\n",24);
		System.out.printf("%#o\n",24); //#의 기능으로 030. 16진수는 0x붙음
		System.out.println(Integer.toOctalString(24));
	}
}
