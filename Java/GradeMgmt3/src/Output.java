import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

class Output {
	private ArrayList<Student> list;
	private PrintStream ps;
	
	public Output(ArrayList<Student> list) {
		this.list = list;
		String path = "./result.dat";
		try {
			this.ps = new PrintStream(
				new BufferedOutputStream(
						new FileOutputStream(path)), true);
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
	
	private void printLabel(){
		this.ps.println("         <<�ֿ� ����б� �����������α׷�>>");
		this.ps.println("�й�\t�̸�\t����\t����\t����\t����\t����\t���\t����");
		this.ps.println("-------------------------------------------------------------------");
	}
	void output() {
		printLabel();
		for(Student s : this.list)   this.ps.println(s);  //s.toString()
		System.out.println("Save success.");
		this.ps.close();
	}
}
