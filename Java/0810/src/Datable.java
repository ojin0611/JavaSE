
public interface Datable {
	// ������ public static final�� �������ִ�.
	int ENG = 100;
	int SUN = 0, MON = 1, TUE = 2, WED = 3, THU = 4, FRI = 5, SAT = 6;
	
	// �޼ҵ�� body�� ������ ����
	void set(int date);
	int get();
}
