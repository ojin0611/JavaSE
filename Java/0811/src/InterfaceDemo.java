import java.util.Arrays;

public class InterfaceDemo {
	public static void main(String[] args) {
		Car[] array = new Car[4];
		
		array[0] = new Car("�ҳ�Ÿ", 25_000_000, "�����ڵ���");
		array[1] = new Car("��Ƽ��", 10_000_000, "����ڵ���");
		array[2] = new Car("ī�Ϲ�", 35_000_000, "����ڵ���");
		array[3] = new Car("SM6", 30_000_000, "����Ｚ�ڵ���");
	
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
	
}
