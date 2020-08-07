import java.util.Scanner;

public class PolymorphismDemo {
	public static void main(String[] args) {
		do {
			int choice = showMenu();
			if (choice==5) break;
			process(choice);
				
		} while (true);
	}
	
	static void process(int choice) {
		Mammal bumo = null; // 선언
		switch(choice) {
		case 1:  bumo = new Dog(); break; //upcasting
		case 2:  bumo = new Dog(); System.out.println("개 아님"); break;
		case 3:  bumo = new Korean(); break;
		case 4:  bumo = new American(); break;
			
		}
		bumo.saySomething();
	}
	
	static int showMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("<<<<Menu>>>>");
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("3. Korean");
		System.out.println("4. American");
		System.out.println("5. Exit");
		System.out.print("어떤 종족? : ");
		int choice = scan.nextInt(); return choice;
	}
}
