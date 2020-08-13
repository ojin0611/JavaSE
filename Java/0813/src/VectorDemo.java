import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(1,1);
		Scanner scan = new Scanner(System.in);
		String y_n = null;
		do {
			System.out.print("Enter a string >> ");
			String line = scan.nextLine();
			vector.add(line);
			System.out.print("Again(y/n) ? : ");
			y_n = scan.nextLine();
		}while(y_n.toUpperCase().equals("Y"));
		System.out.println("입력받은 문장의 갯수 : " + vector.size());
		
	}
}