/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/


/*
1. 100������ �ڿ��� �߿��� 4�� ����̸鼭 5�� ����� �ƴ� �� ����ϱ�

2. 100������ �ڿ��� �߿��� 7 �Ǵ� 9�� ����� �� ����ϱ�

3. �ڿ��� �߿��� 100�� ����� ��� ã�� 1�ٿ� 3���� ����ϱ�

4. ������ ��� ����ϱ�
   1    2    3    4    5
   2    3    4    5
   3    4    5   
   4    5  
   5
   
5. �����ڵ� 41 ~ 122�������� �ڵ�� ���ڸ� �� �ٿ� 8���� ����ϱ�
   41 : )    42 : *   43 : +   44 : ,   45 : -  46 : .   47 : /   48 : 0
   ...
   121 : y  122 : z

*/
public class Quest {
	public static void main(String[] args) {
		// 1.
		System.out.println("1��");
		for (int i=1; i<101; i++){
			if (i%4==0 & i%5>0){
				System.out.print(i +" ");
			}
		}

		System.out.println("\n2��");
		for (int i=1; i<101; i++){
			if (i%7 == 0 | i%9 ==0){
				System.out.print(i + " ");
			}
		}
		System.out.println("\n3��");
		for (int i=1; i<101; i++){
			if (100 % i ==0){
				System.out.print(i + " ");
			}
		}
		System.out.println("\n4��");
		for (int i=1; i<6; i++ ){
			for (int j=i; j<6; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("\n5��");
		int cnt = 0;
		for (int i=41; i<123; i++){
			cnt += 1;
			System.out.printf("%3d : %c  ", i, i);
			if (cnt==8){
				System.out.println();
				cnt = 0;
			}
		}
	}
}
