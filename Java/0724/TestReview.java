/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class TestReview {
	public static void main(String[] args) {
		// & : �� ������. 
		System.out.println(0xff00 & 0x00ff);  // 0
		// &&: ��Ʈ ������
		/*
		System.out.println(0xff00 && 0x00ff); // error
		System.out.println(5 && 7); //error
		*/

		int sum=0; //�ʱ�ȭ ���ϸ�(int sum;) �������µ�, �ʱ�ȭ �ϸ� ���� �� ����.
		for (int i= 1; i<10; i+=2)
		{
			sum = i*2;
		}
		System.out.println("��� : "+sum);

		// boolean -> int
		//System.out.printf("%d", true); error
		boolean myBoolean = false;
		int myInt = myBoolean ? 1 : 0;
		System.out.printf("%d\n\n",myInt);

		// 4 < 5 < 6
		System.out.println(4<5);
		// System.out.println(4<5<6); ������ ����

		// ���������� 
		int a;
		int b=10;
		int c=10;
		a = b++; // a= 10;
		System.out.println(a +" "+b);
		a = ++c; // a= 11;
		System.out.println(a +" "+b);

	}
}
