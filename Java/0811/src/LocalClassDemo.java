public class LocalClassDemo {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.print();
	}
}
class Outer2{
	int a = 5;    //�ٱ� Ŭ������ �������
	static int b = 10;   //�ٱ� Ŭ������ ����ƽ ����
	public void print() {   //�ٱ� Ŭ������ ����޼ҵ�
		final int c = 100;     //��������
		class Inner2{   //����Ŭ����
			public void display() {   //����Ŭ������ ����޼ҵ�
				System.out.println(c);
				System.out.println(b);
			}
		}
		Inner2 in = new Inner2();
		in.display();
	}
}