import java.util.Arrays;

// Interface Ȱ��
public class InterfaceDemo4 {
	public static void main(String[] args) {
		Student[] array = {
				new Student("��ö��", 286, 95.5),
				new Student("�̿���", 295, 98.5),
				new Student("������", 275, 91.3)
		};
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j].compareTo(array[j+1]) > 0) {
					Student temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		
	}
}
