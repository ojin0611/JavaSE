import java.util.Scanner;

public class Input {
	static void input(Student[] array) {              // 입력받을 학생 , new 안쓰려고 static입력}
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = new Student();
			
			System.out.print("학번 : ");    String hakbun = scan.next();
			System.out.print("이름 : ");    String name = scan.next();
			System.out.print("국어 : ");    int kor = scan.nextInt();
			System.out.print("영어 : ");    int eng = scan.nextInt();
			System.out.print("수학 : ");    int mat = scan.nextInt();
			array[i].hakbun = hakbun; 
			array[i].name = name; 
			array[i].kor = kor; 
			array[i].eng = eng; 
			array[i].mat = mat;
		}
	}
}