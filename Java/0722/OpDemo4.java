/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class OpDemo4 {
	public static void main(String[] args) {
		String name = "한지민";
		System.out.printf("한지민 == name ==> %b\n", ("한지민" == name));
		System.out.printf("한지민 == name ==> %b\n", ("한지민".equals(name))); //값비교
		System.out.printf("한지만과 name 차이 > %d\n", ("한지만".compareTo(name)));//값차이
		
		String name2 = new String("김지민");
		System.out.printf("김지민 == name ==> %b\n", ("김지민" == name2));
		System.out.printf("김지민 == name ==> %b\n", ("김지민".equals(name2))); //값비교
		System.out.printf("김지만과 name 차이 > %d\n", ("김지만".compareTo(name2)));//값차이
	}
}
