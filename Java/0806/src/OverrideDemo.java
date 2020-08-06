import java.util.Date;

public class OverrideDemo {
	public static void main(String[] args) {
		Integer in = new Integer(100);
		System.out.println(in.toString());
		System.out.println(in); 
		
		Demo d = new Demo();
		System.out.println(d.toString());
		System.out.println(d); // toString()은 생략이 가능하다!! 왕신기! 그냥 출력하면 주소가아니라 toString()의 리턴값이 출력된다.
		// 디폴트가 Object.toString()이 출력되는건데, 그걸 override했으니 그게 출력되는것
		
		Date now = new Date(); //util의 Date
		System.out.println(now.toString());
		System.out.println(now);
	}
}

class Demo /*extends Object*/{
	String name = "한지민";
	
	// Override 안하면 Object class에 있는 toString() 메소드를 호출한다. 즉, 주소를 리턴한다.
	@Override 
	public String toString() {
		return String.format("이름은 %s입니다%n", this.name);
	}
}