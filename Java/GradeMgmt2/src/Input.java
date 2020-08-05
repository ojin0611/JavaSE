import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Input {
	private Student[] array;
	File file = new File("./sungjuk.dat");
	Scanner scan;
	
	public Input(Student[] array) { // Input이 Student 주소를갖고있음.
		this.array = array;
		try {
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "파일을 찾을 수 없습니다.");
		}
	}
	public void input() {
		for (int i = 0; i < array.length; i++) {
			String line = this.scan.nextLine();
			String[] dataArray = line.split("\\s+");
			
			String hakbun = dataArray[0];
			String name = dataArray[1];
			int kor = Integer.parseInt(dataArray[2]);
			int eng = Integer.parseInt(dataArray[3]);
			int mat = Integer.parseInt(dataArray[4]);
			int his = Integer.parseInt(dataArray[5]);
			
			Student s = new Student(hakbun, name, kor, eng, mat, his);
			this.array[i] = s;
		}
		
		
	}
}
