import java.util.Scanner;
import java.util.Vector;

class Delete {
	private Vector<Friend> vector;
	private Scanner scanner;

	Delete(Vector<Friend> vector) {
		this.vector = vector;
		this.scanner = new Scanner(System.in);
	}

	void delete() {
		System.out.print("������ ģ�� �̸� : ");     String name = this.scanner.next().trim();
		int i;
		for(i = 0 ; i < this.vector.size(); i++) {
			Friend f = this.vector.elementAt(i);
			if(f.getName().trim().equals(name)) {   //ã�Ҵٸ�
				break;
			}
		}
		if(i < this.vector.size()) {
			this.vector.removeElementAt(i);
			System.out.println("���� ����");
		}
		else if(i == this.vector.size()) System.out.println("Not Found.");
	}
	
}
