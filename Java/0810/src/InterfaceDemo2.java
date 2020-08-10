
public class InterfaceDemo2 implements Father, Mother {

	@Override
	public void grandFather() {
		System.out.println("gF()");
	}

	@Override
	public void grandMother() {
		System.out.println("gM()");
	}

	@Override
	public void mother() {
		System.out.println("m()");
	}

	@Override
	public void father() {
		System.out.println("f()");
	}
	
	public static void main(String[] args) {
		GrandFather gf = new InterfaceDemo2();
		gf.grandFather(); // �Ҿƹ����ּҷ� �Ҿƹ����޼ҵ常 ���ٰ���
		// gf.grandMother(); //error
		
		InterfaceDemo2 id = new InterfaceDemo2();
		GrandMother gm = id; 
		gm.grandMother(); // �ٸ� id�� �޼ҵ�� ���ٺҰ�
		
		Father fa = new InterfaceDemo2();
		fa.grandMother(); // ������ �߻�޼ҵ带 �������� �޼ҵ常 ���ٰ���
		
		Mother[] array = new Mother[2]; // �������̽� �迭���� �� �������̽��� �ڽ�Ŭ������ ���
		array[0] = id;
		array[1] = new InterfaceDemo2();
		for (Mother m : array) {
			m.mother();
		}
	}

}
