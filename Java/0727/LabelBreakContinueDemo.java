/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class LabelBreakContinueDemo {
	public static void main(String[] args) {
		outer : // label1
		for (int i=2; i<10; i++){
			inner: // label2
			for (int j=1; j<10; j++)
			{
				if (j==5) // if���� {}������ �� �ٸ� �����ϰ� �Ѿ��.
					// break outer; �ٱ� loop�� ����.
					continue outer; //outer loop�� ���ư�
				System.out.print(i +"*" + j + "=" + i*j + "  "); // if���� ������ ����
			}
			System.out.println();
		}
	}
}
