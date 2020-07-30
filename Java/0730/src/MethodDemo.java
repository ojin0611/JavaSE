
public class MethodDemo {
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		int a=40, b=50;
		int result = md.calcSum(a, b); //md는 주소, result에는 값이 저장
		System.out.println(result);
		System.out.println(md.calcSum(1,100));
	}
	
	int calcSum(int start, int end){
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
}
