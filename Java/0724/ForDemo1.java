/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class ForDemo1 {
	public static void main(String[] args) {
		int i,j; // �̷��� ���߿� for�� �ۿ����� ��밡��
		for (i=1, j=100; i<j; i+=3, j-=2)
		{
			/* 
			for���� ���������� ���� �ϰ� �� ���ڰ� ���ǹ��� �ش�Ǵ��� Ȯ���Ѵ�.
			�� ������ ���, i=61, j=60�� ���� �� (�������� �� i<j�� �������� ���� ��) 
			���ǹ����� �ɷ� for���� �����Եȴ�.
			*/
		}
		System.out.printf("%d %d\n",i,j); // 61,60

	}
}
