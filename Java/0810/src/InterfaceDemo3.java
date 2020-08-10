
public class InterfaceDemo3 {
	public static void main(String[] args) {
		Demo d = new Demo(24);
		// Demo other = d.copy(); clone()�޼ҵ�� ���� �����ϰ� ����Ÿ���� �������� �ʱ⶧���� casting �ʿ�
		Demo other = (Demo)d.copy();
		System.out.println(other.age);
	}
}


class Demo extends Object implements Cloneable{
	// implements Cloneable�� �ٿ��߸� clone() �޼ҵ� ȣ�Ⱑ������
	// �׷��� �긦 flag interface ��� �θ�
	public int age;
	public Demo(int age) {
		this.age =age;
	}
	public Object copy() {
		Object obj = null;
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("clone fail");
		}
		return obj;
	}
}