import java.util.Scanner;

public class Input {
	static void input(Student s) {              // �Է¹��� �л� , new �Ⱦ����� static�Է�}
		Scanner scan = new Scanner(System.in);
		System.out.print("�й� : ");    String hakbun = scan.next();
		System.out.print("�̸� : ");    String name = scan.next();
		System.out.print("���� : ");    int kor = scan.nextInt();
		System.out.print("���� : ");    int eng = scan.nextInt();
		System.out.print("���� : ");    int mat = scan.nextInt();
		s.hakbun = hakbun; s.name = name; s.kor = kor; s.eng = eng; s.mat = mat;
	}
}