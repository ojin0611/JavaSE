import java.util.Arrays;
public class ScoreMgmt {

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
		 * System.out.println("학생들 제출 답안");
		 * for (int i = 0; i < student.length; i++) {
		 * System.out.printf("학생%d : %s\n",i+1,Arrays.toString(student[i])); }
		 */		

		System.out.println("채점 결과");
		int score = 0;
		int cnt = 0;
		for (int[] std: student) {
			score = 0;
			cnt+=1;
			System.out.printf("학생%d : ",cnt);
			for (int j = 0; j < std.length; j++) {
				if (std[j] == answer[j]) {
					System.out.print("O ");
					score += 10;
				}
				else System.out.print("X ");
			}
			System.out.printf("(%d점)\n",score);
		}

	}

}
