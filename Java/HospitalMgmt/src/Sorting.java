// import java.util.Arrays;

public class Sorting {
	private Patient[] array;
	public Sorting(Patient[] array) {
		this.array = array;
	}
	
	public void quickSort(Patient[] array, int start, int end) {
		// start, end는 quickSort의 시작과 끝
		
		int low = start, high = end, mid = array[(start + end)/2].getNo();
		do { // low와 high의 값을 변경해줌.
			while(array[low].getNo() < mid) low++;
			while(array[high].getNo()> mid) high--;
			
			
			if(low<=high) {
				Patient temp=array[low];
				array[low] = array[high];
				array[high] = temp;
				low++; high--;
			}
		}while (low<=high);
		
		System.out.printf("low = %d, high = %d\n",low,high);
		if(start<high) quickSort(array, start, high);
		if(low < end) quickSort(array, low, end);
	}
}
