import java.util.Date;

public class OverrideDemo {
	public static void main(String[] args) {
		Integer in = new Integer(100);
		System.out.println(in.toString());
		System.out.println(in); 
		
		Demo d = new Demo();
		System.out.println(d.toString());
		System.out.println(d); // toString()�� ������ �����ϴ�!! �սű�! �׳� ����ϸ� �ּҰ��ƴ϶� toString()�� ���ϰ��� ��µȴ�.
		// ����Ʈ�� Object.toString()�� ��µǴ°ǵ�, �װ� override������ �װ� ��µǴ°�
		
		Date now = new Date(); //util�� Date
		System.out.println(now.toString());
		System.out.println(now);
	}
}

class Demo /*extends Object*/{
	String name = "������";
	
	// Override ���ϸ� Object class�� �ִ� toString() �޼ҵ带 ȣ���Ѵ�. ��, �ּҸ� �����Ѵ�.
	@Override 
	public String toString() {
		return String.format("�̸��� %s�Դϴ�%n", this.name);
	}
}