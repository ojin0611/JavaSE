import java.util.Scanner;

// prototype 먼저 잡고, 그 다음에 코딩하자
public class ReturnDemo {

	public static void main(String[] args) {
		// 키와 몸무게 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("키 : "); double height = scan.nextDouble();
		System.out.print("몸무게 : "); double weight = scan.nextDouble();
		
		ReturnDemo rd = new ReturnDemo(); // 인스턴스 클래스 쓰기 위해서 주소 끌어오기위해 생성
		
		double bmi = rd.calcBmi(height * 0.01, weight);
		rd.printLevel(bmi);
	} // 여기서 scan, height, weight은 소멸된다. 지역변수니까!!
	
	
	
	// BMI지수 계산
	double calcBmi(double height, double weight){
		double bmi = 0;
		return bmi;
	}
	
	
	// BMI지수에 의한 5단계레벨 출력
	void printLevel(double bmi) {
		System.out.println("정상");
		
	}
}
