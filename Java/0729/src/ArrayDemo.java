
public class ArrayDemo {
	public static void main(String[] args) {
		/*
		 * 1. Rectangular Array (�� ���� ���� ����) 
		 * 2. Ragged Array (�� ���� ���� ���̰� �ٸ���)
		 * 
		*/
		
		  
		
		int[][] array; // 1. ���� // int[] array[]; �� ����

		array = new int[3][4]; // 2. ����

		array[0][0] = 1;
		array[1][2] = 10; // 3. �Ҵ�		
		
		int[][] array2;
		array2 = new int[][] {
			{3,4,5,6},
			{7,8,9,10},
			{11,12,13,14}
		};
		
		int[][] array3 = {
				{3,4,5,6},
				{7,8,9,10},
				{11,12,13,14}
			};
		
		// Ragged Array
		int[][] array4;
		array4 = new int[3][];
		array4[0] = new int[3]; //00,01,02
		array4[1] = new int[5]; //10,11,12,13,14
		array4[2] = new int[2]; //20,21    �� ����
		
		System.out.println(array4[2][2]);
		
	}
}
