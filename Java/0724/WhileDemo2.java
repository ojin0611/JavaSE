/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class WhileDemo2 {
	public static void main(String[] args) {
		int i=1;
		while (i<9)
		{
			i++;
			int j=0;
			while (j<9)
			{
				j++;
				System.out.printf("%2d *%2d = %2d  ", i, j, i*j);
			}
			System.out.println();
		}
	}
}
