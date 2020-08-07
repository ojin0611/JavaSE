import java.util.Scanner;

public class Add {
	private Friend[] array;
	Scanner scan;
	
	public Add(Friend[] array) {
		this.array = array;
		this.scan = new Scanner(System.in);
	}
	
	public void add(int count) {
		if (count >= array.length) {
			System.out.println("��ȭ��ȣ�ΰ� �� á�µ���;;");
			return;
		}
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		
		System.out.print("���� : ");
		String relationship = scan.nextLine();
		
		System.out.print("��ȭ��ȣ : ");
		String phone = scan.nextLine();

		array[count-1] = new Friend(name, relationship, phone);
		
	}
}
