
public class Initialized {
	private int x;// = 5;
	private String name;// = "Fred";
	
	
	public Initialized() {}
	public Initialized(int x, String name) { 
		this.x = x;
		this.name = name;
	}
	
	private Initialized(int x) { // ���� Ŭ���� �������� ��밡��
		this.x = x;
	}
	
	public Initialized(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Initialized in = new Initialized(14, "Pray");
		Initialized in2= new Initialized(16); // ���� main�Լ��� �ٸ� Ŭ������ �־��ٸ� �� �����ڴ¸�����
		
		System.out.println(in.x  + in.name);
		System.out.println(in2.x + in2.name);
		
		Initialized in3= new Initialized(); // ���� public Initialized(){} �ȸ���� ����
		System.out.println(in3.x + in3.name);
		
		
	}
}
