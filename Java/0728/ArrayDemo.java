/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

import java.util.Arrays;
public class ArrayDemo {
	public static void main(String[] args) {
		int [] original = {1,2,3,4,5,6,7,8,9,10}; //10��
		int [] target = {10,9,8,7,6}; //5��

		//shallow copy
		System.arraycopy(original, 0, target, 0, 3); 
		System.out.println(Arrays.toString(target));

		original[0] = 1000;
		System.out.println(Arrays.toString(target)); //original �����ص� �ȹٲ��. 

		//deepcopy : �ּҺ���
		target = original;
		System.out.println(Arrays.toString(target)); 
	}
}

/*
�д�����ũ
���̵̹��
��������

ICT�����ش���
������ũ����а�
���ִ��б�
*/