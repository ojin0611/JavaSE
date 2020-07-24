/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class ForDemo4 {
	public static void main(String[] args) {
		for (int i=5; i>0; i--){
			for (int j=1; j<=i; j++){
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}
}
