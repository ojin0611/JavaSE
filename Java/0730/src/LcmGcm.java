import java.util.Scanner;

public class LcmGcm {

	public static void main(String[] args) {
		// 정수 2개 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.print("1st : "); int a = scan.nextInt();
		System.out.print("2nd : "); int b = scan.nextInt();

		LcmGcm lg = new LcmGcm();
		int gcm = lg.calcGcm(a,b); // 주소 생성 후 주소로 부르기
		int lcm = calcLcm(a,b,gcm); // 같은 클래스 안에 있는 class method인 경우 클래스이름 생략 가능
		LcmGcm.printResult(a,b,gcm,lcm); // 클래스 이름으로 부르는게 국룰
	}
	// gcm
	int calcGcm(int a, int b) {
		return 1;
	};
	
	// lcm
	static int calcLcm(int a, int b, int gcm) {
		return 1;
	};
	
	// print
	static void printResult(int a, int b, int gcm, int lcm) {
		System.out.printf("%d와 %d의 최대공약수, 최소공배수를 위의 코드로 구할 수 있습니다.", a,b);
	};
	

}
