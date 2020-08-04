
public class Initialized {
	private int x;// = 5;
	private String name;// = "Fred";
	
	
	public Initialized() {}
	public Initialized(int x, String name) { 
		this.x = x;
		this.name = name;
	}
	
	private Initialized(int x) { // 같은 클래스 내에서만 사용가능
		this.x = x;
	}
	
	public Initialized(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Initialized in = new Initialized(14, "Pray");
		Initialized in2= new Initialized(16); // 만약 main함수가 다른 클래스에 있었다면 이 생성자는못쓸걸
		
		System.out.println(in.x  + in.name);
		System.out.println(in2.x + in2.name);
		
		Initialized in3= new Initialized(); // 만약 public Initialized(){} 안만들면 에러
		System.out.println(in3.x + in3.name);
		
		
	}
}
