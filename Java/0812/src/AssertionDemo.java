
public class AssertionDemo {
	public static void main(String[] args) {
		int i, sum = 0;
		for (i = 0; i < 51; i++) {
			sum += i;
		}
		assert i > 100: "100�� �ݺ� ���� Ȯ��";
		assert sum > 100: "���� �˻� �ʿ�";
		System.out.println("sum = " + sum);
	}
}
