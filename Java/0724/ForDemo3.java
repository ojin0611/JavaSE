/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class ForDemo3 {
	public static void main(String[] args) {
		for (int i=1; i<6; i++){
			for (int j=0; j<6; j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		for (int i=0; i<5; i++){
			for (int j=i; j<i+6; j++){
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
