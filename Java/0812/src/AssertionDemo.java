
public class AssertionDemo {
	public static void main(String[] args) {
		int i, sum = 0;
		for (i = 0; i < 51; i++) {
			sum += i;
		}
		assert i > 100: "100번 반복 여부 확인";
		assert sum > 100: "누적 검사 필요";
		System.out.println("sum = " + sum);
	}
}
