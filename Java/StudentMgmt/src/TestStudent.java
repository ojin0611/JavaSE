import java.util.Scanner;

public class TestStudent {
	private Scanner scan;  //member variable
	public static void main(String[] args) {
		TestStudent ts = new TestStudent();
		System.out.println("<<학사 프로그램 시작>>");
		ts.scan = new Scanner(System.in);
		int choice = ts.showMenu();
		ts.branch(choice);
		System.out.println("<<학사 프로그램 종료>>");
	}
	void branch(int choice){//member method
		switch(choice) {
			case 1: gotoUnderGraduate();   break;
			case 2: gotoGraduate(); break;
			default : 
				System.out.println("잘못된 값입니다. \n프로그램을 종료합니다.");  
				System.exit(-1);
		}
	}
	void gotoGraduate() {
		System.out.println("[반갑습니다. 대학원생]");
		System.out.print("이름 : ");           String name = this.scan.next();
		System.out.print("학번 : ");           String hakbun = this.scan.next();
		System.out.print("소속학과 : ");        String dept = this.scan.next();
		System.out.print("학년 : ");           int grade = this.scan.nextInt();
		System.out.print("이수 학점 수 : ");      int point = this.scan.nextInt();
		System.out.print("조교 유형 : ");        String assistantType = this.scan.next();
		System.out.print("장학금 비율 : ");      double rate = this.scan.nextDouble();
		Graduate gra = new Graduate(name, hakbun, dept, grade, point, assistantType, rate);
		System.out.println(gra);
	}
	void gotoUnderGraduate() {
		System.out.println("[반갑습니다. 학부생]");
		System.out.print("이름 : ");          String name = this.scan.next();
		System.out.print("학번 : ");          String hakbun = this.scan.next();
		System.out.print("소속학과 : ");       String dept = this.scan.next();
		System.out.print("학년 : ");          int grade = this.scan.nextInt();
		System.out.print("이수 학점 수 : ");    int point = this.scan.nextInt();
		System.out.print("소속 동아리 이름 : "); String club = this.scan.next();
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

