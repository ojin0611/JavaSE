import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {3,4,7,1,2,9,3,4,6};
		System.out.println(Arrays.toString(array));

		quickSort(array,0,array.length-1);
		
		System.out.println(Arrays.toString(array));

	}
	
	static void quickSort(int[] array, int start, int end) {
		// start, end는 quickSort의 시작과 끝
		int low = start, high = end, mid = array[(start + end)/2];
		do { // low와 high의 값을 변경해줌.
			while(array[low] < mid) low++;
			while(array[high]> mid) high--;
			if(low<=high) {
				int temp=array[low];
				array[low] = array[high];
				array[high] = temp;
				System.out.printf("%s, start=%d end=%d low=%d high=%d\n", 
						Arrays.toString(array), start, end, low, high);	
				low++; high--;
			}
		}while (low<=high);
		
		System.out.printf("low = %d, high = %d\n",low,high);
		if(start<high) quickSort(array, start, high);
		if(low < end) quickSort(array, low, end);
	}

}
