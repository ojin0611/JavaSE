import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Scanner scan; // instance variable
	private Telephone[] array;
	
	
	public Input(Telephone[] array) { // default Constructor's overriding
		File file = new File("./data.txt");
		try {
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		this.array= array;
	}
	
	
	public void input() {
		for (int i = 0; i < array.length; i++) {
			String line = this.scan.nextLine();
			String[] dataArray = line.split("\\s+"); // 한칸이상의 스페이스바
			int kind = Integer.parseInt(dataArray[0]);
			String tel = dataArray[1];
			String name = dataArray[2];
			int quantity = Integer.parseInt(dataArray[3]);
			Telephone telephone = new Telephone(kind, tel, name, quantity);
			this.array[i] = telephone;
		}
	}

}
