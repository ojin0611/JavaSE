/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class LabelBreakContinueDemo {
	public static void main(String[] args) {
		outer : // label1
		for (int i=2; i<10; i++){
			inner: // label2
			for (int j=1; j<10; j++)
			{
				if (j==5) // if문에 {}없으면 한 줄만 실행하고 넘어간다.
					// break outer; 바깥 loop가 끝남.
					continue outer; //outer loop로 돌아감
				System.out.print(i +"*" + j + "=" + i*j + "  "); // if문에 들어가있지 않음
			}
			System.out.println();
		}
	}
}
