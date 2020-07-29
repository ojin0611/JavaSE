import java.util.Scanner;
public class ScoreMgmt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] array = new Student[3]; // 주소만 갖고 있음.
		for (int i = 0; i < array.length; i++) {
			array[i] = new Student(); // 이 때 비로소 array[i]는 Student 객체가 된다.
			System.out.println(array[i].name);
			System.out.print("학번 : "); array[i].studentId = scan.next();
			System.out.print("국어 : "); array[i].kor = scan.nextInt();
			System.out.print("영어 : "); array[i].eng = scan.nextInt();
			System.out.print("수학 : "); array[i].mat = scan.nextInt();
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
		
		System.out.println("<<쌍용고 성적관리프로그램>>");
		System.out.println("등수\t학번\t이름\t국어\t영어\t수학\t총점\t평균\t평점");
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
