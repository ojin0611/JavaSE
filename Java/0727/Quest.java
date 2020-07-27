/*
�翵��
20-07-25
�ָ� ����
https://www.onlinegdb.com/ ���� Java ����
*/
import java.util.Scanner;
public class Quest{
	public static void main(String[] args) {
        /*	    
        1. ���� ������ ����ϱ�
           1   0   0   0   0
           0   2   0   0   0
           0   0   3   0   0
           0   0   0   4   0
           0   0   0   0   5  
          1)ForLoopDemo.java
        */
        System.out.println("\n1��");
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
        2. 10��°������ �Ǻ���ġ ���� ����ϱ�
          1)������
             1   1   2   3   5   8   13   21   34   55
          2)Fibonacci.java
          3)�ݵ�� �ݺ����� ����� ��, �� ���ȣ�� ���Ұ�
        */
        System.out.println("\n2��");
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
        3. �� ���� ������ �Է¹޾� �ִ������� �ּҰ���� ���ϱ�
          1)LcmGcm.java
          2)�Է����� 
            ù°�� : 32
            ��°�� : 24
          3)�������
            32�� 24�� GCM�� 8�̰� LCM�� 96�Դϴ�.
        */
        System.out.println("\n3��");
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
        System.out.printf("%d, %d�� GCM = %d", a,b,gcm);
        
        /*
        4. 1���� 200������ �Ҽ�(Prime Number) ����ϱ�
          1)Prime.java
          2)�� �ٿ� 10������ ����Ѵ�.
        */
        System.out.println("\n4��");
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
        5. �Է¹��� ������ ���μ� �����Ͽ� ����ϱ�
           1)Prime1.java
           2)�Է����� 
             ���� : 30
           3)�������(�� ���μ� ���ص� ��� ���ڴ� ���� �ȵǾ ��)
             30 --> 5   3   2
           4)���� 
             100 --> 5   5   2   2
             34  --> 17  2
             19  --> 19
             128 --> 2  2   2   2   2   2   2
        */
        System.out.println("\n5��");
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
