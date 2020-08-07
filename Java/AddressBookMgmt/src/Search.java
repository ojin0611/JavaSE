import java.util.Scanner;

public class Search {
	private Friend[] array;
	Scanner scan;
	
	public Search(Friend[] array) {
		super();
		this.array = array;
		this.scan = new Scanner(System.in);
	}
	
	public void search(int count) {
		System.out.print("�̸��� �˻����ּ��� : ");
		String name = scan.nextLine();
		
		for(int i=0; i<count; i++) {
			if(name.equals(array[i].getName())) {
				System.out.println("====�˻��Ϸ�====");
				System.out.println(array[i]);
				System.out.println("==================================");
				return;
			}
		}	
		System.out.println("==================================");
		System.out.println("������ �̸��� �����ϴ�.");
		System.out.println("==================================");
	}
	
}