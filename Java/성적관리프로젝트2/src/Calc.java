public class Calc {
	static void calc(Student[] array) {               // ����� �л�,   new �Ⱦ����� static�Է�}
		for (int i = 0; i < array.length; i++) {
			int tot = array[i].kor + array[i].eng + array[i].mat;
			double avg = tot /3.;
			char grade = (avg >= 90) ? 'A' :
							(avg >= 80) ? 'B' :
								(avg >= 70) ? 'C' :
									(avg >= 60) ? 'D' : 'F';
			array[i].tot = tot; 
			array[i].avg = avg; 
			array[i].grade = grade;
			
		}
	}
}