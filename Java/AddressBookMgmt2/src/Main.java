import java.util.Scanner;
import java.util.Vector;

public class Main {
	private Scanner scan;    //member variable
	private Vector<Friend> vector;
	
	Main() {  //������
		this.scan = new Scanner(System.in);
		this.vector = new Vector<Friend>(1,1);
	}
	public static void main(String[] args) {
		Main m = new Main();
		do {
			int choice = m.showMenu();
			if(choice == 9) break;
			m.process(choice);
		}while(true);
	}
	private int showMenu() {
		System.out.println("1. �߰�          2. �˻�             3. ��Ϻ���           4. ����           9. ����");
		System.out.print(">> ");
		return this.scan.nextInt();
	}
	private void process(int choice) {
		switch(choice) {
			case 1 : gotoInput();  break;
			case 2 : gotoSearch(); break; 
			case 3 : gotoPrint();    break;
			case 4 : gotoDelete();  break;
			default : return;
		}
	}
	private void gotoDelete() {
		if(this.vector.size() == 0) {
			System.out.println("���� ������ �����Ͱ� �����ϴ�.");
			return;
		}
		Delete delete = new Delete(this.vector);
		delete.delete();
	}
	private void gotoSearch() {
		if(this.vector.size() == 0) {
			System.out.println("���� �˻��� �����Ͱ� �����ϴ�.");
			return;
		}
		Search search = new Search(this.vector);
		search.linearSearch();
	}
	private void gotoPrint() {
		if(this.vector.size() == 0) {
			System.out.println("���� ����� �����Ͱ� �����ϴ�.");
			return;
		}
		Output output = new Output(this.vector);
		output.output();
	}
	private void gotoInput() {
		Input input = new Input(this.vector);
		input.input();
	}
}
