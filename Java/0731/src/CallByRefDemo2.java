import java.util.Arrays;
import java.util.Scanner;

public class CallByRefDemo2{
	public static void main(String[] args) {
		int[] array = new int[1000];
		int n = input(array);
		output(array, n);
	}
	static int input(int[] array) { // 주소를 넘기는 것을 참조형 반환 타입
		Scanner scan = new Scanner(System.in);
		int su = 0;
		int i=0;
		System.out.println("정수 입력(0은 종료)");
		while((su=scan.nextInt()) != 0 && i<1000) {
			array[i++] = su;
		}
		
		return i-1; // array의 길이가 아닌, 입력받은 숫자의 개수!
	}
	
	static void output(int[] array, int n){
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + "\t");
		};
	}

}
