import java.util.Scanner;

public class Input {

	public Telephone input() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("����(1 : ������, 2 : ��û��, 3 : ������) : ");
		int kind = scan.nextInt();
		
		System.out.println("��ȭ��ȣ : "); String tel = scan.next();
		System.out.println("�̸� : ");    String name = scan.next();
		System.out.println("��ȭ�� : ");   int quantity = scan.nextInt();
		
		Telephone phone = new Telephone(kind, tel, name, quantity);
		return phone;
	}

}
