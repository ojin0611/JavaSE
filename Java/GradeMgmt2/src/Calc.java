
public class Calc {
	private Student[] array;
	public Calc(Student[] array) {
		this.array = array;
	}
	
	
	public void calc() {
		for (int i = 0; i < array.length; i++) {
			int tot = array[i].getKor() + array[i].getEng() + array[i].getMat() + array[i].getHis();
			array[i].setTot(tot);
			
			double avg = tot/4;
			array[i].setAvg(avg);
			
			char grade;
			switch ((int)avg/10) {
			case 10: grade = 'A'; break;
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default: grade = 'F';
			}
			array[i].setGrade(grade);
		}
		
	}
}
