public class ExceptionDemo2 {
	public static void main(String[] args) {
		ExceptionTest t = null;
		try{
			t = new ExceptionTest(99, 80);
		}catch(KoreanException | EnglishException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(t);
	}
}