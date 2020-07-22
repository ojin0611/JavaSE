/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class OpDemo6 {
	public static void main(String[] args) {
		int score = 59;
		String result = (score < 60) ? "불합격" : "합격";
		System.out.println(result);

		double avg = 59.5;
		char grade =(avg >= 90) ? 'A':
						(avg >= 80) ? 'B' :
							(avg >= 70) ? 'C' :
								(avg >= 60) ? 'D' : 'F';
		System.out.printf("%c\n", grade);

		int hour = 11;
		System.out.println(hour < 12 ? "오전" : "오후");
	}
}
