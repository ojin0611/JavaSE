import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Input {
	private ArrayList<Student> list;  //선언
	private String data;
	
	Input(ArrayList<Student> list) {
		this.list = list;
		this.data = this.init();
	}
	
	void input() {
		//System.out.println(this.data);
		StringTokenizer st = new StringTokenizer(this.data, "\n");
		int count = st.countTokens(); //12
		while(st.hasMoreTokens()) {
			String line = st.nextToken().trim();    //1101  한송이   78  87  83  78
			Scanner scan = new Scanner(line).useDelimiter("\\s+");
			Student s = new Student(scan.next(), scan.next(), 
					scan.nextInt(), scan.nextInt(), 
					scan.nextInt(), scan.nextInt());
			this.list.add(s);
		}
	}
	private String init() {
		String data = null;
		String path = "./sungjuk.dat";
		try(FileInputStream fis = new FileInputStream(path)){
			byte [] buffer = new byte[1024];
			int count = fis.read(buffer);
			data = new String(buffer, 0, count);
		}catch(FileNotFoundException ex) {
			System.out.println("File Not Found");
		}catch(IOException ex) {
			System.out.println(ex);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		return data;
	}
}



