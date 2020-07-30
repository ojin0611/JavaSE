
public class CallByValueDemo {
	public static void main(String[] args) {
		int a=5;
		System.out.println("계산 전 : " + a);
		change(a);
		System.out.println("계산 후 : " + a);
		
		int b=5;
		System.out.println("계산 전 : " + b);
		b=change2(b);
		System.out.println("계산 후 : " + b);
}
	
	static void change(int number) { // call by balue, 값복사
		number = number + 2;
		System.out.println("함수 내부 결과 : " + number);
	}

	static int change2(int number) { // call by balue, 값복사
		number = number + 2;
		System.out.println("함수 내부 결과 : " + number);
		return number;
	}

}
