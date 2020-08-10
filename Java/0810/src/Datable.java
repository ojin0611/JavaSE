
public interface Datable {
	// 변수는 public static final이 생략돼있다.
	int ENG = 100;
	int SUN = 0, MON = 1, TUE = 2, WED = 3, THU = 4, FRI = 5, SAT = 6;
	
	// 메소드는 body가 있으면 에러
	void set(int date);
	int get();
}
