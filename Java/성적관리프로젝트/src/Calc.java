public class Calc {
	static void calc(Student s) {               // ����� �л�,   new �Ⱦ����� static�Է�}
		int tot = s.kor + s.eng + s.mat;
		double avg = tot /3.;
		char grade = (avg >= 90) ? 'A' :
						(avg >= 80) ? 'B' :
							(avg >= 70) ? 'C' :
								(avg >= 60) ? 'D' : 'F';
		s.tot = tot; s.avg = avg; s.grade = grade;
	}
}