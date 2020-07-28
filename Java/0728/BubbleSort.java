/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Arrays;

public class BubbleSort { // 앞부터 두 개를 비교. 계속 뒤로보내기
	public static void main(String[] args) {
		int[] array = {5,8,2,1,4,6,2,3,7,9};
		System.out.println("Before");
		System.out.println(Arrays.toString(array)); // array를 string으로 출력하는 방법
		for (int i=0; i<array.length - 1; i++)
		{
			for (int j=0; j<array.length - 1; j++)
			{
				if (array[j] < array[j+1]) // 여기서 오름차순 또는 내림차순 결정가능
				{
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("After");
		System.out.println(Arrays.toString(array));
	}
}
