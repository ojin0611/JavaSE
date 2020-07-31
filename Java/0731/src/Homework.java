
public class Homework {
	public static void main(String[] args) {
		int[][] array = new int[10][10];
		int number = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 9-i; j < array.length; j++) {
				array[i][j] = number++;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j]==0) {
					System.out.print("   ");
				}
				else System.out.printf("%3d", array[i][j]);
			}
			System.out.println();
		}
	}

}
