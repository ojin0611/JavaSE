
public class EverySort {
	// static으로 해야 주소에 접근해서 array 값이 바뀐다.
	static void bubbleSort(int[] array) { // 앞뒤 계~속 바꿔서 하나씩 맨끝으로 보낸다.
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j]; 
					array[j] = array[j+1]; 
					array[j+1] = temp;
				}
			}
		}
	}
	static void selectionSort(int[] array) { // i 위치에 올 j 를 찾는다.
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}
	static void insertionSort(int[] array) {
		int i,j,tmp;
		for (i = 1; i < array.length; i++) {
			tmp = array[i];
			for (j = i-1; j >= 0 && array[j] > tmp; j--) {
				array[j+1] = array[j];
			}
			array[j+1] = tmp;
		}
	}

}
