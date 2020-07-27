/*
양영진
20-07-25
주말 과제
https://www.onlinegdb.com/ 에서 Java 선택
*/
import java.util.Scanner;
public class Quest{
	public static void main(String[] args) {
        /*	    
        1. 다음 결과대로 출력하기
           1   0   0   0   0
           0   2   0   0   0
           0   0   3   0   0
           0   0   0   4   0
           0   0   0   0   5  
          1)ForLoopDemo.java
        */
        System.out.println("\n1번");
        for (int i=1; i<6; i++){
            for (int j=1; j<6; j++){
                if (i==j){
                    System.out.print(i + "  ");
                }
                else{
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
        /*
        2. 10번째까지의 피보나치 수열 출력하기
          1)실행결과
             1   1   2   3   5   8   13   21   34   55
          2)Fibonacci.java
          3)반드시 반복문을 사용할 것, 즉 재귀호출 사용불가
        */
        System.out.println("\n2번");
        int dp_n = 1;
        int dp_n_1 = 0;
        int tmp = 0;
        for (int i=1; i<10; i++){
            System.out.print(dp_n + " ");
            tmp = dp_n;
            dp_n = dp_n + dp_n_1;
            dp_n_1 = tmp;

        }
        /*
        3. 두 개의 정수를 입력받아 최대공약수와 최소공배수 구하기
          1)LcmGcm.java
          2)입력형식 
            첫째수 : 32
            둘째수 : 24
          3)출력형식
            32와 24의 GCM은 8이고 LCM은 96입니다.
        */
        System.out.println("\n3번");
        Scanner scan = new Scanner(System.in);
        int a = 32;
        int b = 24;
        
        int gcm = 0;
        int lcm = 0;

        int x=a;
        int y=b;
        while (true){
            if (x%y==0){
                gcm = y;
                break;
            }else{
                tmp = y;
                y = x%y;
                x = tmp;
            }
        }
        System.out.printf("%d, %d의 GCM = %d", a,b,gcm);
        
        /*
        4. 1부터 200까지의 소수(Prime Number) 출력하기
          1)Prime.java
          2)한 줄에 10개씩만 출력한다.
        */
        System.out.println("\n4번");
        int cnt = 0;
        boolean sosu = true;
        for (int i=2; i<201; i++){
            sosu = true;
            for (int j=2; j<i; j++){
                if(i%j==0) {
                    sosu = false;
                    break;
                }
            }
            if (sosu) {
                System.out.printf("%3d ",i);
                cnt += 1;
                if (cnt%10==0){
                    System.out.println();
                }
            }
        }
        
        /*
        5. 입력받은 정수를 소인수 분해하여 출력하기
           1)Prime1.java
           2)입력형식 
             정수 : 30
           3)출력형식(단 소인수 분해된 출력 숫자는 정렬 안되어도 됨)
             30 --> 5   3   2
           4)연습 
             100 --> 5   5   2   2
             34  --> 17  2
             19  --> 19
             128 --> 2  2   2   2   2   2   2
        */
        System.out.println("\n5번");
        int n=30;
        int m=n;
        System.out.printf("%3d --> ",n);
        for (int i=2; i<n; i++){
            while(true){
                if (m%i==0){
                    m = m/i;
                    System.out.printf("%2d  ",i);
                }
                else{
                    break;
                }
            }
        }
        System.out.println();
    }
}
