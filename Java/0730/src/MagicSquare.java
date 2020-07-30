import java.util.Arrays;

public class MagicSquare {
	public static void main(String[] args) {
		int WIDTH = 3 ;
		int[][] square = new int[WIDTH][WIDTH];
		
		int i = 0;
		int j = WIDTH/2;
		square[i][j] = 1;
		for (int n=2; n<= WIDTH*WIDTH; n++) {
			if (n%WIDTH == 1) i++;
			else {
				i--;
				j++;
			}
			if (i<0) i += WIDTH;
			if (j>=WIDTH) j -= WIDTH;
			square[i][j] = n;
		}
		
		for (int n=0; n<WIDTH; n++)
		System.out.println(Arrays.toString(square[n]));
	}
}
