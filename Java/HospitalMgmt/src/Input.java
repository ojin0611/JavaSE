import java.util.Scanner;

public class Input {
	Scanner scan;
	Patient[] array;
	
	public Input(Patient[] array) {
		this.scan = new Scanner(System.in);
		this.array = array;
	}
	public Patient[] input() {
		
		int count=0;
		String io = "I";
		do {
			System.out.print("번호는 ? : ");
			int no = scan.nextInt();

			System.out.print("진료코드는 ? : ");
			String code = scan.next();

			System.out.print("입원일수는 ? :");
			int days = scan.nextInt();

			System.out.print("나이는? : ");
			int age = scan.nextInt();
			
			System.out.print("입력/출력 (I/O)?");
			io = scan.next();
			
			this.array[count] = new Patient(no, code, days, age);
			count++;
		} while( io.equals("I"));
		
		Patient[] arr = new Patient[count];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = this.array[i];
		}
		
		return arr;
	}
}
