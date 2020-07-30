import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		int[] array = {4,7,1,2,4,8,3,5,9};
		EverySort.bubbleSort(array);
		Main m = new Main();
		m.print(array);

		int[] array2 = {4,7,1,2,4,8,3,5,9};
		EverySort.selectionSort(array2);
		m.print(array2);
	
		int[] array3 = {4,7,1,2,4,8,3,5,9};
		EverySort.insertionSort(array3);
		m.print(array3);
	}
	void print(int[] array) {
		System.out.println(Arrays.toString(array));
	}

}
