/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class TestReview {
	public static void main(String[] args) {
		// 0xff00 & 0x00ff
		// &, && ����

		// boolean -> int

		// 4 < 5 < 6

		// print(5++), int a=10--

		// 3 / int(5.2)
		
		// & : �� ������. 
		System.out.println(0xff00 & 0x00ff);  // 0
		// &&: ��Ʈ ������
		/*
		System.out.println(0xff00 && 0x00ff); // error
		System.out.println(5 && 7); //error
		*/

		int sum; //�ʱ�ȭ ���ϸ� �������µ�, �ʱ�ȭ �ϸ� ���� �� ����.
		for (int i= 1; i<10; i+=2)
		{
			sum = i*2;
		}
		System.out.println("��� : "+sum);
	}
}
