
public class Output {
	static void output(Student s) {             // ����� �л�,   new �Ⱦ����� static�Է�
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c%n", s.hakbun, s.name, s.kor, s.eng, s.mat, s.tot, s.avg, s.grade);
	}   
}