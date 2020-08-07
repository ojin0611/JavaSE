/*
 * Conversion / Cast
 * 1. Primitive Type
 * 	1) �ڵ�����ȯ, promotion
 * 		4 + 89.5 -> double
 * 	2) ��������ȯ, demotion
 * 		(int)89.5 = 89;
 * 
 * 2. Reference Type
 * 	1) �ڵ�����ȯ, �ڽ� -> �θ�. cast up. ����ȯ ��������
 *  2) ��������ȯ, �θ� -> �ڽ�. downward cast. ����ȯ �����Ұ�
 */
public class ObjectConversion {
	public static void main(String[] args) {
		Object obj = new Object();
		String str = new String();
		obj = str; // �ڵ�����ȯ
		
		if (obj instanceof String) System.out.println("true");
		else System.out.println("false");
		
		
		Object obj1 = new String(); // �ڵ�����ȯ
		
		
		Test test = new Test();
		Demo demo = new Demo();
		
		test= (Test)demo; // ������ �ڽ��� ����ȯ��ų �� �ִ�.
		// demo= (Demo)test; // error. �ڽ��� ������ �ڽ���������ȯ�Ҽ�����.
	}
}

class Test{}
class Demo extends Test{}