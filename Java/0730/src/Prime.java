
public class Prime {
	public static void main(String[] args) {

		Prime p = new Prime(); // Prime class�� �ִ� instance method�� ����ϱ� ���� �ּҸ� �����´�(=�����Ѵ�).
		for (int i = 0; i < 200; i++) {
			if(p.checkPrime(i)) {
				System.out.print(i+"\t");
			}
		}
	}

	boolean checkPrime(int number) {
		return false;
	}
}
