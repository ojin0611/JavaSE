
public class Output {
	static void output(Student s) {             // 출력할 학생,   new 안쓰려고 static입력
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c%n", s.hakbun, s.name, s.kor, s.eng, s.mat, s.tot, s.avg, s.grade);
	}   
}