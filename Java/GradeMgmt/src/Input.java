import java.util.Scanner;

public class Input {
	private Student[] array;
	Scanner scan = new Scanner(System.in);
	
	public Input(Student[] array) { // Input이 Student 주소를갖고있음.
		this.array = array;
	}
	public void input() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("<< "+(i+1)+"번째 학생 입력>>");
			System.out.print("학번 : "); String hakbun = scan.next();
			System.out.print("이름 : "); String name = scan.next();
			System.out.print("국어 : "); int kor = scan.nextInt();
			System.out.print("영어 : "); int eng = scan.nextInt();
			System.out.print("수학 : "); int mat = scan.nextInt();
			
			Student s = new Student(hakbun, name, kor, eng, mat);
			this.array[i] = s;
		}
		
		
	}
}
