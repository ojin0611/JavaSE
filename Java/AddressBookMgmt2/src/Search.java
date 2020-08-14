import java.util.Scanner;
import java.util.Vector;

class Search {
	private Vector<Friend> vector;
	private Scanner scanner;

	Search(Vector<Friend> vector) {
		this.vector = vector;
		this.scanner = new Scanner(System.in);
	}

	void linearSearch() {
		System.out.print("검색할 이름 : ");     String name = this.scanner.next().trim();
		int i;
		for(i = 0 ; i < this.vector.size(); i++) {
			Friend f = this.vector.elementAt(i);
			if(f.getName().trim().equals(name)) {   //찾았다면
				break;
			}
		}
		if(i == this.vector.size())  System.out.println("Not Found.");
		else System.out.println(this.vector.elementAt(i));   //toString()
	}

}
