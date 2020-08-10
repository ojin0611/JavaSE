
public class InterfaceDemo3 {
	public static void main(String[] args) {
		Demo d = new Demo(24);
		// Demo other = d.copy(); clone()메소드는 값만 복사하고 참조타입은 복사하지 않기때문에 casting 필요
		Demo other = (Demo)d.copy();
		System.out.println(other.age);
	}
}


class Demo extends Object implements Cloneable{
	// implements Cloneable을 붙여야만 clone() 메소드 호출가능해짐
	// 그래서 얘를 flag interface 라고 부른
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