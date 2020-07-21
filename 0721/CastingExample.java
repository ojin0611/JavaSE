/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
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
		intValue = (int) doubleValue; // 손실 발생
		System.out.println(intValue);
		
		short age = 24;
		double avg = 89;
		// age = avg; //error
		age = (byte)avg;
		System.out.println(age);

		byte a=5; byte b=9;
		// byte sum = a + b; //error. java에서 +를 하면 이유불문하고 int. 
		byte sum = 5+9;
		System.out.println(sum);
	}
}
