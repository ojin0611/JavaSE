import java.util.Scanner;

public class TestStudent {
	private Scanner scan;  //member variable
	public static void main(String[] args) {
		TestStudent ts = new TestStudent();
		System.out.println("<<�л� ���α׷� ����>>");
		ts.scan = new Scanner(System.in);
		int choice = ts.showMenu();
		ts.branch(choice);
		System.out.println("<<�л� ���α׷� ����>>");
	}
	void branch(int choice){//member method
		switch(choice) {
			case 1: gotoUnderGraduate();   break;
			case 2: gotoGraduate(); break;
			default : 
				System.out.println("�߸��� ���Դϴ�. \n���α׷��� �����մϴ�.");  
				System.exit(-1);
		}
	}
	void gotoGraduate() {
		System.out.println("[�ݰ����ϴ�. ���п���]");
		System.out.print("�̸� : ");           String name = this.scan.next();
		System.out.print("�й� : ");           String hakbun = this.scan.next();
		System.out.print("�Ҽ��а� : ");        String dept = this.scan.next();
		System.out.print("�г� : ");           int grade = this.scan.nextInt();
		System.out.print("�̼� ���� �� : ");      int point = this.scan.nextInt();
		System.out.print("���� ���� : ");        String assistantType = this.scan.next();
		System.out.print("���б� ���� : ");      double rate = this.scan.nextDouble();
		Graduate gra = new Graduate(name, hakbun, dept, grade, point, assistantType, rate);
		System.out.println(gra);
	}
	void gotoUnderGraduate() {
		System.out.println("[�ݰ����ϴ�. �кλ�]");
		System.out.print("�̸� : ");          String name = this.scan.next();
		System.out.print("�й� : ");          String hakbun = this.scan.next();
		System.out.print("�Ҽ��а� : ");       String dept = this.scan.next();
		System.out.print("�г� : ");          int grade = this.scan.nextInt();
		System.out.print("�̼� ���� �� : ");    int point = this.scan.nextInt();
		System.out.print("�Ҽ� ���Ƹ� �̸� : "); String club = this.scan.next();
		UnderGraduate gra = new UnderGraduate(name, hakbun, dept, grade, point, club);
		System.out.println(gra);
	}
	int showMenu() {  //member method
		System.out.println("<<Menu>>");
		System.out.println("1. UnderGraduate");
		System.out.println("2. Graduate");
		System.out.println("Who are you(1/2)? : ");
		int choice = this.scan.nextInt();   return choice;
	}
}

