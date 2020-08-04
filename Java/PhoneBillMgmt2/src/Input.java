import java.util.Scanner;

public class Input {
	private Scanner scan; // instance variable
	private Telephone[] array;
	
	
	public Input(Telephone[] array) { // default Constructor's overriding
		this.scan = new Scanner(System.in);
		this.array= array;
	}
	
	
	public void input(Telephone[] array) {
		for (int i = 0; i < this.array.length; i++) {
			System.out.print("����(1 : ������, 2 : ��û��, 3 : ������) : ");
			int kind = this.scan.nextInt();
			
			System.out.print("��ȭ��ȣ : "); String tel = scan.next();
			System.out.print("�̸� : ");    String name = scan.next();
			System.out.print("��ȭ�� : ");   int quantity = scan.nextInt();
			
			Telephone phone = new Telephone(kind, tel, name, quantity);
			array[i] = phone;
		}
	}

}
