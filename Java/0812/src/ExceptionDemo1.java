public class ExceptionDemo1 {
	public static void main(String[] args) throws Exception {
		Parent p = new Child();
		p.print();
	}
}
class Parent{
	public void print() throws Exception { System.out.println("���� �θ��� �޼ҵ�");  }
}
class Child extends Parent{
	@Override
	public void print() throws RuntimeException { System.out.println("���� �ڽ��� �޼ҵ�");  }
}
