import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Input {
	private Account[] array;
	private Scanner scan;
	
	public Input(Account[] array) { // Constructor 가 하는 일이 좀 많네
		this.array = array;
		
		File file = new File("./data.dat");
		try {
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "파일을 찾을 수 없습니다.");;
		}
	}
	
	public void input() {
		for (int i = 0; i < this.array.length; i++) {
			String line = this.scan.nextLine(); // 박지민	178.3	72.4	34
			String[] dataArray = line.split("\\s+");
			double height = Double.parseDouble(dataArray[1]);
			double weight = Double.parseDouble(dataArray[2]); // "72.4" --> 72.4
			int age = Integer.parseInt(dataArray[3]);
			Account acc = new Account(dataArray[0], height, weight, age);
			this.array[i] = acc;
		}
	}
}
