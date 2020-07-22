/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/


/*
1. 받은 돈과 상품 가격을 입력받아 거스름돈을 계산하여 출력하기
  상품 금액을 입력하세요 : 5300
  받은 돈을 입력하세요 : 10000
  거스름돈은 4700원입니다.

2. 키보드로부터 초 단위의 정수를 입력받아, 시분초 단위로 환산하기
  시간을 초 단위로 입력하시오 : 7654
  7654초는 2시간 7분 34초 입니다.

3. 상품 가격을 입력받아, 지불에 필요한 5만원권, 만원권, 5천원권, 천원권의 최소 개수와 나머지 금액을 구하기
  상품가격을 입력하세요 : 152365
  152365원은 5만원권 3장, 만원권 0장, 5천원권 0장, 천원권 2장을 지불하고 365원이 남습니다.
*/

import java.util.Scanner;
public class Quest1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1.
		System.out.println("1. 받은 돈과 상품 가격을 입력받아 거스름돈을 계산하여 출력하기");
		System.out.print("상품 금액을 입력하세요 : ");
		int price = scan.nextInt();

		System.out.print("받은 돈을 입력하세요 : ");
		int receive=scan.nextInt();

		int rest = receive - price;
		System.out.printf("거스름돈은 %d원입니다.\n", rest);

		
		//2.
		/*
		7654 = 2시간 7분 34초
		7654 = 2*3600 + 7*60 + 34
		*/
		System.out.println("\n2. 키보드로부터 초 단위의 정수를 입력받아, 시분초 단위로 환산하기");
		System.out.print("시간을 초 단위로 입력하시오 : ");
		int input  = scan.nextInt();
		int hour   = input / 3600;
		int minute = input % 3600 / 60;
		int second = input % 60;

		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.\n",
			input, hour, minute, second);

		//3.
		System.out.println("\n3. 상품 가격을 입력받아, 지불에 필요한 5만원권, 만원권, 5천원권, 천원권의 최소 개수와 나머지 금액을 구하기");
		System.out.print("상품가격을 입력하세요 : ");
		price = scan.nextInt();
		int oman = price / 50000;
		int man  = price % 50000 / 10000;
		int ochun= price % 10000 / 5000;
		int chun = price % 5000 / 1000;
		rest = price % 1000;
		System.out.printf("%d원은 5만원권 %d장, 만원권 %d장, 5천원권 %d장, 천원권 %d장을 지불하고 %d원이 남습니다.",
			price, oman, man, ochun, chun, rest);


	}
}
