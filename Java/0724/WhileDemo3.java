/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class WhileDemo3 {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while (true)
		{
			sum += i;
			if (sum>100_0000)
			{
				break;
			}
			i++;
		}
		System.out.printf("%d���� ���ϸ� %d�� �˴ϴ�", i, sum);
	}
}
