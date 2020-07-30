import java.util.Arrays;

public class MatrixCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2},{3,4}};
		int[][] b = {{5,6},{7,8}};
		
		int[][] plus = new int[a.length][a[0].length];
		int[][] multiple = new int[a.length][b[0].length];
		// plus
		
		System.out.println("plus");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				plus[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println(Arrays.toString(plus[0]));
		System.out.println(Arrays.toString(plus[1]));
		
		// multiple
		
		System.out.println("multiple");
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k=0; k<a[i].length; k++) {
					multiple[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		
		System.out.println(Arrays.toString(multiple[0]));
		System.out.println(Arrays.toString(multiple[1]));
		
		
	}

}
