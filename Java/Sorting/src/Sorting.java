import java.util.Arrays;

public class Sorting {
	public void selectionSort() {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 20 + 1);
		}
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));

	}

	public void bubbleSort() {
		int[] array = {5,8,2,1,4,6,2,3,7,9};
		System.out.println("Before");
		System.out.println(Arrays.toString(array)); // array를 string으로 출력하는 방법
		for (int i=0; i<array.length - 1; i++)
		{
			for (int j=0; j<array.length - 1; j++)
			{
				if (array[j] < array[j+1]) // 여기서 오름차순 또는 내림차순 결정가능
				{
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("After");
		System.out.println(Arrays.toString(array));
	}
	
	// insertionSort
	
	
	// quickSort
}
