/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class DoWhileDemo {
	public static void main(String[] args) {
		int rand1, rand2;
		while (true){
			rand1 = (int)(Math.random() * 6 + 1);
			rand2 = (int)(Math.random() * 6 + 1);
			System.out.println(rand1 +" "+ rand2);
			if (rand1 != rand2) break;
		}

		do {
			rand1 = (int)(Math.random() * 6 + 1);
			rand2 = (int)(Math.random() * 6 + 1);
			System.out.println(rand1 + "," + rand2);
		} while (rand1==rand2);
	}
}
