/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/


/*
1. 100이하의 자연수 중에서 4의 배수이면서 5의 배수가 아닌 값 출력하기

2. 100이하의 자연수 중에서 7 또는 9의 배수인 값 출력하기

3. 자연수 중에서 100의 약수를 모두 찾아 1줄에 3개씩 출력하기

4. 다음의 결과 출력하기
   1    2    3    4    5
   2    3    4    5
   3    4    5   
   4    5  
   5
   
5. 유니코드 41 ~ 122번까지의 코드와 문자를 한 줄에 8개씩 출력하기
   41 : )    42 : *   43 : +   44 : ,   45 : -  46 : .   47 : /   48 : 0
   ...
   121 : y  122 : z

*/
public class Quest {
	public static void main(String[] args) {
		// 1.
		System.out.println("1번");
		for (int i=1; i<101; i++){
			if (i%4==0 & i%5>0){
				System.out.print(i +" ");
			}
		}

		System.out.println("\n2번");
		for (int i=1; i<101; i++){
			if (i%7 == 0 | i%9 ==0){
				System.out.print(i + " ");
			}
		}
		System.out.println("\n3번");
		for (int i=1; i<101; i++){
			if (100 % i ==0){
				System.out.print(i + " ");
			}
		}
		System.out.println("\n4번");
		for (int i=1; i<6; i++ ){
			for (int j=i; j<6; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("\n5번");
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
