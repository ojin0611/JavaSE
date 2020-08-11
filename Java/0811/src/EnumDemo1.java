public class EnumDemo1 {
	public static void main(String[] args) {
		System.out.println("�̱��� 10��Ʈ ������ ������ " + getColor(Coin.DIME));
	}
	static CoinColor getColor(Coin c) {
		switch(c) {
			case PENNY :  return CoinColor.COPPER;   
			case NICKEL : return CoinColor.NICKEL;    
			case DIME :    
			case QUARTER : return CoinColor.SILVER;
			default :   
				return null;
		}
	}
}
enum Coin{
	PENNY(1), NICKEL(5), DIME(10), QUARTER(25), SUNSIN(100);
	Coin(int value){   //������
		this.value = value;
	}
	private final int value;
	public int getValue()  { return this.value; }
}
enum CoinColor {
	COPPER, NICKEL, SILVER;
}