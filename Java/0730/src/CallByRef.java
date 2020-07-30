
public class CallByRef {

	public static void main(String[] args) {
		int [] array = {5,9};
		System.out.println("Before Swap");
		System.out.println("a = " + array[0] + ",b = " + array[1]);

		//a = change(a);
		swap(array); // Call By Reference

		System.out.println("After Swap");
		System.out.println("a = " + array[0] + ",b = " + array[1]);
	}

	static void swap (int [] array)  // int [] a target = original;
	{
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		System.out.println("In the Swap");
		System.out.println("c = " + array[0] + ",d = " + array[1]);
	}
	
}
