/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class WhileDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max=0;
		while (true){
			int i = scan.nextInt();
			if (i<0){
				break;
			}
			if (i>max){
				max=i;
			}
		}
	System.out.print(max);
	}
}
