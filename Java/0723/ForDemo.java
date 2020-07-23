/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class ForDemo {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i=1; i<=100; i+=1)
		{
			if (i%5==0) {
				System.out.print(i + " ");
				cnt += 1;
			}
		}
		System.out.println("\n" + cnt);
	}
}
