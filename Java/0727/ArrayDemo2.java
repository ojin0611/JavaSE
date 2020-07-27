/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class ArrayDemo2 {
	public static void main(String[] args) {
		float[] array= new float[4];
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<4; i++)
		{
			System.out.print(">> : ");
			array[i] = scan.nextFloat();
		}
	}
}
