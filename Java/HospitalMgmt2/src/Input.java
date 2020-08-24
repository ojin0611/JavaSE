import java.util.Scanner;
import java.util.Vector;
public class Input {
	private Vector<Patient> vector;
	private Scanner scan;
	public Input(Vector <Patient> vector){
		this.vector = vector;
		this.scan = new Scanner(System.in);
	}
	public int input(){
		int count = 0;
		char y_n = '\0';   //초기화
		do{
			System.out.print("번호 : ");
			int no = this.scan.nextInt();
			System.out.print("진료코드 : ");
			String code = this.scan.next();
			System.out.print("입원일수 : ");
			int days = this.scan.nextInt();
			System.out.print("나이 : ");
			int age = this.scan.nextInt();
			System.out.print("입력 / 출력 (I/O) ? :");
			y_n = this.scan.next().charAt(0);
			Patient p = new Patient(no, code, days, age);
			this.vector.addElement(p);
		}while(count <= 5 && (y_n == 'i' || y_n == 'I'));
		return count;
	}
}
