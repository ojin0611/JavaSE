
public class AbstractionDemo1 {
	public static void main(String[] args) {
		Car[] array;
		array = new Car[3]; // �׳� �����̴�. ���� array[i]�� Car�� �Ҵ���� �ʾҾ�!
		for (int i = 0; i < array.length; i++) {
			array[i] = new Car();
			
		}
		
		array[0].name = "�ҳ�Ÿ";
		array[1].name = "ī��";
		array[2].name = "��";

	}

}
