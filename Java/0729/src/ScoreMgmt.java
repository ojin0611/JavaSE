import java.util.Scanner;
public class ScoreMgmt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] array = new Student[3]; // �ּҸ� ���� ����.
		for (int i = 0; i < array.length; i++) {
			array[i] = new Student(); // �� �� ��μ� array[i]�� Student ��ü�� �ȴ�.
			System.out.println(array[i].name);
			System.out.print("�й� : "); array[i].studentId = scan.next();
			System.out.print("���� : "); array[i].kor = scan.nextInt();
			System.out.print("���� : "); array[i].eng = scan.nextInt();
			System.out.print("���� : "); array[i].mat = scan.nextInt();
			array[i].rank = 1;
		}
		
		for (Student std: array) {
			std.tot = std.kor + std.eng + std.mat;
			std.avg = std.tot / 3.;
			std.grade = (std.avg >= 90) ? 'A':
				(std.avg >= 80) ? 'B' :
					(std.avg >= 70) ? 'C' :
						(std.avg >= 60) ? 'D' : 'F';
		}
		
		System.out.println("<<�ֿ�� �����������α׷�>>");
		System.out.println("���\t�й�\t�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("----------------------------------");
		
		for (Student std: array) {
			System.out.printf("%d\t%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c", 
					std.rank, std.studentId, std.name, std.kor, std.eng, std.mat,
					std.tot, std.avg, std.grade);
			System.out.println();
		}
		
		for (int i=0; i<array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i].tot > array[i].tot) {
					array[j].rank++;
				}
				else if (array[i].tot < array[j].tot) {
					array[i].rank++;
				}
			}
		}
		for (Student std: array) {
			System.out.printf("%d\t%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c", 
					std.rank, std.studentId, std.name, std.kor, std.eng, std.mat,
					std.tot, std.avg, std.grade);
			System.out.println();
		}
		
		
	}

}
