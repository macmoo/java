package jp.wings.pocket.chap2;

public class ArraySample {

	public static void main(String[] args) {
		
		int[] array1 = new int[5];
		int[] array2 = new int[]{ 2, 4, 6 };
		int[] array3 = { 2, 4 ,6 };
		
		array1[0] = 5;

		int x;
		x = array2[2] + array1[0];

		System.out.println( x );

	}

}
