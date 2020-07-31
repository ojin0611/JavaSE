public class Calc {
	static void calc(Student[] array) {               // 계산할 학생,   new 안쓰려고 static입력}
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