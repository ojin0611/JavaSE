import java.util.Scanner;

public class Input {
	static void input(Student s) {              // 입력받을 학생 , new 안쓰려고 static입력}
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 : ");    String hakbun = scan.next();
		System.out.print("이름 : ");    String name = scan.next();
		System.out.print("국어 : ");    int kor = scan.nextInt();
		System.out.print("영어 : ");    int eng = scan.nextInt();
		System.out.print("수학 : ");    int mat = scan.nextInt();
		s.hakbun = hakbun; s.name = name; s.kor = kor; s.eng = eng; s.mat = mat;
	}
}