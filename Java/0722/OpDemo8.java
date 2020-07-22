/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class OpDemo8 {
	public static void main(String[] args) {
		// 3항 연산자 사용시 주의할 점
		// int result = (true)? 9 : 9.5; //컴파일러는 (true)보다 뒤에를 먼저 본다 ㅡㅡ
		double result = (true)? 9 : 9.5;
		System.out.println("result = " + result);
	}
}
