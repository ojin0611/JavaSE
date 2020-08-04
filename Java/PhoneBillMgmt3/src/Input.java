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
			System.out.print("����(1 : ������, 2 : ��û��, 3 : ������) : ");
			int kind = this.scan.nextInt();
			
			System.out.print("��ȭ��ȣ : "); String tel = scan.next();
			System.out.print("�̸� : ");    String name = scan.next();
			System.out.print("��ȭ�� : ");   int quantity = scan.nextInt();
			
			Telephone phone = new Telephone(kind, tel, name, quantity);
			array[i] = phone;
		}
		*/
	}

}
