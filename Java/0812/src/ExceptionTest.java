public class ExceptionTest {
	private int kor, eng;

	public ExceptionTest(int kor, int eng) throws KoreanException, EnglishException{
		if(kor < 0 || kor > 100) 
			throw new KoreanException("잘못된 국어점수");
		if(eng < 0 || eng > 100)
			throw new EnglishException("잘못된 영어점수");
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Test [kor=" + kor + ", eng=" + eng + "]";
	}
}