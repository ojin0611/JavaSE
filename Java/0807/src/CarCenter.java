/*
 * instanceof ���
 * 1. �θ��� ���������� �ڽ�Ŭ����(����) �˰����� ��
 * 2. �θ����� �ڽ������� ��������ȯ ���ɿ��� �˰����� ��
 */
public class CarCenter {
	public static void main(String[] args) {
		CarCenter cc= new CarCenter();
		Sonata sonata = new Sonata("Silver Son");
		cc.repair(sonata);
		Carnival carnival = new Carnival("White Carn");
		cc.repair(carnival);
	}
	/*
	void repair(Sonata sonata) {
		System.out.println(sonata + " ������");
	}
	*/

	void repair(Car car) {
		System.out.println(car + " ���� �Ϸ�");
	}

}
