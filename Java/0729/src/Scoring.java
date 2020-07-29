import java.util.Arrays;

/*
1 2 3 4 1 2 3 4 1 2
[ �л��� ���� ��� ]
�л�1 : 1 2 2 4 2 2 3 4 1 2
�л�2 : 1 2 3 4 1 1 1 4 1 1
�л�3 : 1 2 3 4 1 2 3 4 1 2
�л�4 : 1 3 3 3 3 3 3 3 1 2
�л�5 : 1 2 3 4 1 2 3 1 1 2
[ ä�� ��� ]
�л�1 : O O X O X O O O O O (80��)
�л�2 : O O O O O X X O O X (70��)
�л�3 : O O O O O O O O O O (100��)
�л�4 : O X O X X X O X O O (50��)
�л�5 : O O O O O O O X O O (90��)
*/
import java.util.Arrays;
public class Scoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};
		int[][] student = new int[5][10];

		student[0] = new int[] {1, 2, 2, 4, 2, 2, 3, 4, 1, 2};
		student[1] = new int[] {1, 2, 3, 4, 1, 1, 1, 4, 1, 1};
		student[2] = new int[] {1,2,3,4,1,2,3,4,1,2};
		student[3] = new int[] {1,3,3,3,3,3,3,3,1,2};
		student[4] = new int[] {1,2,3,4,1,2,3,1,1,2};
		/*
		 * System.out.println("�л��� ���� ���");
		 * for (int i = 0; i < student.length; i++) {
		 * System.out.printf("�л�%d : %s\n",i+1,Arrays.toString(student[i])); }
		 */		

		System.out.println("ä�� ���");
		int score = 0;
		int cnt = 0;
		for (int[] std: student) {
			score = 0;
			cnt+=1;
			System.out.printf("�л�%d : ",cnt);
			for (int j = 0; j < std.length; j++) {
				if (std[j] == answer[j]) {
					System.out.print("O ");
					score += 10;
				}
				else System.out.print("X ");
			}
			System.out.printf("(%d��)\n",score);
		}
	}

}
