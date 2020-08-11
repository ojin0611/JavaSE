
public enum Week {
	// 상수만 저장할 수 있다.
	SUN(0), MON(100), TUE(101), WED(1000), THU(1001), FRI(10000), SAT(50000);
	private int value;
	
	Week(int value){
		this.value = value;
	}
	public int getValue() {return this.value;}
}

/*
Week SUN = new Week(0);
Week MON = new Week(100);

private static final SUN = 0;

MON = 100
TUE = 101
*/