/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class OpDemo3 {
	public static void main(String[] args) {
		int su = -128;
		int result = su >> 5;
		int result1 = su >>> 5;
		System.out.println("su = " + su);
		System.out.println("su = " + Integer.toBinaryString(su));
		
		System.out.println("result = " + result);
		System.out.println("result = " + Integer.toBinaryString(result));

		System.out.println("result1 = " + result1);
		System.out.println("result1 = " + Integer.toBinaryString(result1));
	}
}
