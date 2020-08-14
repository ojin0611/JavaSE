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
		System.out.print("삭제할 친구 이름 : ");     String name = this.scanner.next().trim();
		int i;
		for(i = 0 ; i < this.vector.size(); i++) {
			Friend f = this.vector.elementAt(i);
			if(f.getName().trim().equals(name)) {   //찾았다면
				break;
			}
		}
		if(i < this.vector.size()) {
			this.vector.removeElementAt(i);
			System.out.println("삭제 성공");
		}
		else if(i == this.vector.size()) System.out.println("Not Found.");
	}
	
}
