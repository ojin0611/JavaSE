
public class Student {
	private String name, hakbun;
	private int kor, eng, mat, his, tot;
	private double avg;
	private char grade;
	
	
	
	public Student(String hakbun, String name, int kor, int eng, int mat, int his) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.his = his;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getHis() {
		return his;
	}
	public void setHis(int his) {
		this.his = his;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return String.format("Student [name=%s, hakbun=%s, kor=%s, eng=%s, mat=%s, his=%s, tot=%s, avg=%s, grade=%s]",
				name, hakbun, kor, eng, mat, his, tot, avg, grade);
	}

	
	
	public void print() {
		System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\t %d\t %.1f\t %c\n",
				hakbun, name, kor, eng, mat, his, tot, avg, grade);
	}
	
	
}

