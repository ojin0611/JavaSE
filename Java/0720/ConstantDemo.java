/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : OS, Version, Editor
*/

public class ConstantDemo {
	public static void main(String[] args) {
		double pi = 3.141592;
		// final double PI = 3.141592; 상수로 고정하는 방법 = final
		System.out.printf("pi의 값은 %f입니다.\n", pi);
		pi = 3.14;
		System.out.printf("pi의 값은 %f입니다.\n", pi);
		
		int max = Integer.MAX_VALUE;
		System.out.printf("max = %d.\n", max);
		System.out.printf("max보다 1 큰 Integer = %d.\n", max + 1);
		
		// Overflow
		byte min = Byte.MIN_VALUE;
		System.out.printf("가장 작은 값 = %d.\n", min);
		System.out.printf("가장 작은 값보다 1 작은 값 = " + (min-1) + "\n");
		System.out.printf("가장 작은 값보다 1 작은 byte = " + (byte)(min-1) + "\n");
		
	}
}
