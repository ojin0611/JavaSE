// �߻�Ŭ������ ���� : �������� ����ȭ
public abstract class Mammal { // ������ ���������ʴ� Ŭ����
	public String name = "Mamma";
	public Mammal(String name) {
		this.name = name;
	}
	public abstract void print(); //���� ��. �޼ҵ�������(Override)���ϸ� ����
}

class Lion extends Mammal{
	public Lion(String name) {
		super(name);
	}
	
	@Override
	public void print() {
		System.out.println("�ڽĸ޼ҵ�");
	}
}

