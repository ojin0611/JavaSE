import java.util.Scanner;

public class Input {
	private Student[] array;
	Scanner scan = new Scanner(System.in);
	
	public Input(Student[] array) { // Input�� Student �ּҸ���������.
		this.array = array;
	}
	public void input() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("<< "+(i+1)+"��° �л� �Է�>>");
			System.out.print("�й� : "); String hakbun = scan.next();
			System.out.print("�̸� : "); String name = scan.next();
			System.out.print("���� : "); int kor = scan.nextInt();
			System.out.print("���� : "); int eng = scan.nextInt();
			System.out.print("���� : "); int mat = scan.nextInt();
			
			Student s = new Student(hakbun, name, kor, eng, mat);
			this.array[i] = s;
		}
		
		
	}
}
