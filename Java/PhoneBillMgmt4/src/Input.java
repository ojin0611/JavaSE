import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Input {
	private Scanner scan;   //member variable
	private Vector<Telephone> list; 
	
	public Input(Vector<Telephone> list) {
		File file = new File("./data.txt");
		try {
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			System.exit(-1);
		}
		this.list = list;
	}
	
	public void input() {
		//System.out.println(this.list.capacity());
		for(int i = 0 ; i < this.list.capacity() ; i++) {
			//2     422-5123   박은지    1084
			String line = this.scan.nextLine();
			StringTokenizer st = new StringTokenizer(line);
			String [] array = new String[st.countTokens()];   //4개의 방
			int idx = 0;
			while(st.hasMoreTokens()) {
				array[idx++] = st.nextToken();
			}
			Telephone phone = new Telephone(Integer.parseInt(array[0]), array[1], 
					                                         array[2], Integer.parseInt(array[3]));
			//this.list.add(phone);
			this.list.addElement(phone);
		}
	}
}




