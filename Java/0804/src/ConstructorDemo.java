
public class ConstructorDemo {
	String name;
	int price;
	
	public ConstructorDemo() { // default constructor
		this.name = null;
		this.price = 0;
	}
	
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();
		System.out.println("name = "+ cd.name);
		System.out.println("price = "+cd.price);
		
		String s = new String(); // api에 String()이라는 기본생성자가 있음
		// Integer i = new Integer(); // 얘는 api에없어서 에러
	}
}
