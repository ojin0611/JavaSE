/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class ForDemo1 {
	public static void main(String[] args) {
		int i,j; // 이러면 나중에 for문 밖에서도 사용가능
		for (i=1, j=100; i<j; i+=3, j-=2)
		{
			/* 
			for문은 증감연산을 먼저 하고 그 숫자가 조건문에 해당되는지 확인한다.
			이 문제의 경우, i=61, j=60이 됐을 때 (증감연산 시 i<j가 성립하지 않을 때) 
			조건문에서 걸려 for문이 끝나게된다.
			*/
		}
		System.out.printf("%d %d\n",i,j); // 61,60

	}
}
