import java.util.Scanner;

public class Input {
	static void input(Student[] array) {              // �Է¹��� �л� , new �Ⱦ����� static�Է�}
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = new Student();
			
			System.out.print("�й� : ");    String hakbun = scan.next();
			System.out.print("�̸� : ");    String name = scan.next();
			System.out.print("���� : ");    int kor = scan.nextInt();
			System.out.print("���� : ");    int eng = scan.nextInt();
			System.out.print("���� : ");    int mat = scan.nextInt();
			array[i].hakbun = hakbun; 
			array[i].name = name; 
			array[i].kor = kor; 
			array[i].eng = eng; 
			array[i].mat = mat;
		}
	}
}