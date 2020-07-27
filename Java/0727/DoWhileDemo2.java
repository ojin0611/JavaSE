/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class DoWhileDemo2 {
	public static void main(String[] args) {
		int i=2;
		do {
			for (int j=1; j<10; j++)
			{
				System.out.printf("%d * %d = %2d   ", i, j, i*j);
			}
			i++;
			System.out.println();
		}
		while (i<10);

		String myString;
		int myInt;
		do
		{
			myString = "Hello Java";
			myInt = 1024;
		}
		while (false);
		System.out.println(myString + " " + myInt);
}
