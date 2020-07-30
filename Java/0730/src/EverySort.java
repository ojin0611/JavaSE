
public class EverySort {
	// static���� �ؾ� �ּҿ� �����ؼ� array ���� �ٲ��.
	static void bubbleSort(int[] array) { // �յ� ��~�� �ٲ㼭 �ϳ��� �ǳ����� ������.
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
	static void selectionSort(int[] array) { // i ��ġ�� �� j �� ã�´�.
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
