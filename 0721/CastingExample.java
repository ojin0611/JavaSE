/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class CastingExample {
	public static void main(String[] args) {	
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; // �ս� �߻�
		System.out.println(intValue);
		
		short age = 24;
		double avg = 89;
		// age = avg; //error
		age = (byte)avg;
		System.out.println(age);

		byte a=5; byte b=9;
		// byte sum = a + b; //error. java���� +�� �ϸ� �����ҹ��ϰ� int. 
		byte sum = 5+9;
		System.out.println(sum);
	}
}
