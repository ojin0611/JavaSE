/*
작성자 : 
작성목적 :
작성일시 :
작성환경 : OS, Version, Editor
*/

public class LiteralDemo5 {
	public static void main(String[] args) {
		System.out.printf("%d,   %f,   %s,   %c,   %b\n",
						24, 3.141592, "Hello", 'C', 4<6);
		System.out.printf("%05d,%7.2f,%10s,%-5c,%5b\n",
						24, 3.141592, "Hello", 'C', 4<6);
	}
}
