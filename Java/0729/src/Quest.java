/*
	> �¼��� �����Ͻðڽ��ϱ�? (��-1 �ƴϿ�-0) : 1
	==���� �¼� ����==
	[1]���డ��   [2]���డ��   [3]���డ��   [4]���డ��   [5]���డ��
	[6]���డ��   [7]���డ��   [8]���డ��   [9]���డ��   [10]���డ��
	�� ��° �¼��� �����Ͻðڽ��ϱ�? 2
	����Ǿ����ϴ�.
	> �¼��� �����Ͻðڽ��ϱ�? (��-1 �ƴϿ�-0) : 1
	==���� �¼� ����==
	[1]���డ��   [2]�����     [3]���డ��   [4]���డ��   [5]���డ�� 
	[6]���డ��   [7]���డ��  [8]���డ��   [9]���డ��   [10]���డ��
	�� ��° �¼��� �����Ͻðڽ��ϱ�? 2
	�̹� ����� �¼��Դϴ�.
	> �¼��� �����Ͻðڽ��ϱ�? (��-1 �ƴϿ�-0) : 0
	���α׷��� �����մϴ�.
*/
import java.util.Scanner;
public class Quest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ������ �ʱ�ȭ
		int reserve = 0;
		int seatNumber = 0;
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		String[] reserved = new String[10];
		for (int i = 0; i < reserved.length; i++) {
			reserved[i] = "���డ��";
		}
		while (true) {
			// �¼� �����ұ��?
			System.out.print("�¼��� �����Ͻðڽ��ϱ�? (��-1 �ƴϿ�-0) : ");
			reserve = Integer.parseInt(scan.nextLine());
			
			// �����ϴ� ���
			if (reserve==1) {
				System.out.println("==���� �¼� ����==");
				for (int i = 0; i < number.length; i++) {
					System.out.printf("[%d]%s  ", number[i], reserved[i]);
					if (i%5==4) System.out.println();
				}
				// ������� �ڸ� �Է¹ޱ�
				System.out.println("�� ��° �¼��� �����Ͻðڽ��ϱ�? ");
				seatNumber = Integer.parseInt(scan.nextLine());
				
				// ���� ������ ���
				if (reserved[seatNumber-1].equals("���డ��")) {
					reserved[seatNumber-1] = "�����  ";
					System.out.println("����Ǿ����ϴ�.");
				}
				// ���� �Ұ����� ���
				else System.out.println("�̹� ����� �¼��Դϴ�.");
			}
			// ��������
			else {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
			
	}

}
