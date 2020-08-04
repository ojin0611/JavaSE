import java.util.Scanner;

public class Input {

	public Telephone input() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("구분(1 : 영업용, 2 : 관청용, 3 : 가정용) : ");
		int kind = scan.nextInt();
		
		System.out.println("전화번호 : "); String tel = scan.next();
		System.out.println("이름 : ");    String name = scan.next();
		System.out.println("통화량 : ");   int quantity = scan.nextInt();
		
		Telephone phone = new Telephone(kind, tel, name, quantity);
		return phone;
	}

}
