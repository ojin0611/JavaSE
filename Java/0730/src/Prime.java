
public class Prime {
	public static void main(String[] args) {

		Prime p = new Prime(); // Prime class에 있는 instance method를 사용하기 위해 주소를 가져온다(=생성한다).
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
