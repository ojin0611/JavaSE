/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class WhileDemo3 {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while (true)
		{
			sum += i;
			if (sum>100_0000)
			{
				break;
			}
			i++;
		}
		System.out.printf("%d까지 더하면 %d가 됩니다", i, sum);
	}
}
