import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Scanner scan; // instance variable
	private Telephone[] array;
	
	
	public Input(Telephone[] array) { // default Constructor's overriding
		File file = new File("D:/JavaHome/Java/PhoneBillMgmt3/data.txt");
		try {
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		this.array= array;
	}
	
	
	public void input() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.scan.nextLine());
		}
		/*
		for (int i = 0; i < this.array.length; i++) {
			System.out.print("구분(1 : 영업용, 2 : 관청용, 3 : 가정용) : ");
			int kind = this.scan.nextInt();
			
			System.out.print("전화번호 : "); String tel = scan.next();
			System.out.print("이름 : ");    String name = scan.next();
			System.out.print("통화량 : ");   int quantity = scan.nextInt();
			
			Telephone phone = new Telephone(kind, tel, name, quantity);
			array[i] = phone;
		}
		*/
	}

}
