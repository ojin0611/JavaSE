
public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{3,4,5},{6,7,8}};
		System.out.println(array.length); 
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				System.out.printf("array[%d][%d] = %d\t\t", i,j,array[i][j]);
			}
			System.out.println();
		}
		
		int[][][] array2= new int[3][4][5];
		System.out.println(array2.length); // 가장 앞숫자 3. 
		System.out.println(array2[0].length); // 4
		System.out.println(array2[0][0].length); // 5 
		
		
		for (int[] arr : array) {
			for (int su: arr) {
				// System.out.print(su + "\t");
				// System.out.print(Arrays.toString(arr));
			}
			System.out.println();
		}
		
	}

}
