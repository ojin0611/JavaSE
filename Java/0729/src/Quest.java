/*
	> 좌석을 예약하시겠습니까? (예-1 아니오-0) : 1
	==현재 좌석 상태==
	[1]예약가능   [2]예약가능   [3]예약가능   [4]예약가능   [5]예약가능
	[6]예약가능   [7]예약가능   [8]예약가능   [9]예약가능   [10]예약가능
	몇 번째 좌석을 예약하시겠습니까? 2
	예약되었습니다.
	> 좌석을 예약하시겠습니까? (예-1 아니오-0) : 1
	==현재 좌석 상태==
	[1]예약가능   [2]예약됨     [3]예약가능   [4]예약가능   [5]예약가능 
	[6]예약가능   [7]예약가능  [8]예약가능   [9]예약가능   [10]예약가능
	몇 번째 좌석을 예약하시겠습니까? 2
	이미 예약된 좌석입니다.
	> 좌석을 예약하시겠습니까? (예-1 아니오-0) : 0
	프로그램을 종료합니다.
*/
import java.util.Scanner;
public class Quest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 변수들 초기화
		int reserve = 0;
		int seatNumber = 0;
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		String[] reserved = new String[10];
		for (int i = 0; i < reserved.length; i++) {
			reserved[i] = "예약가능";
		}
		while (true) {
			// 좌석 예약할까요?
			System.out.print("좌석을 예약하시겠습니까? (예-1 아니오-0) : ");
			reserve = Integer.parseInt(scan.nextLine());
			
			// 예약하는 경우
			if (reserve==1) {
				System.out.println("==현재 좌석 상태==");
				for (int i = 0; i < number.length; i++) {
					System.out.printf("[%d]%s  ", number[i], reserved[i]);
					if (i%5==4) System.out.println();
				}
				// 예약받을 자리 입력받기
				System.out.println("몇 번째 좌석을 예약하시겠습니까? ");
				seatNumber = Integer.parseInt(scan.nextLine());
				
				// 예약 가능한 경우
				if (reserved[seatNumber-1].equals("예약가능")) {
					reserved[seatNumber-1] = "예약됨  ";
					System.out.println("예약되었습니다.");
				}
				// 예약 불가능한 경우
				else System.out.println("이미 예약된 좌석입니다.");
			}
			// 예약종료
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
			
	}

}
