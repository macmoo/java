package jp.wings.pocket.chap4;

import java.util.Arrays;

public class CopyArySampleRange {
	public static void main(String[] args){

		String[] org = { "a", "b", "c", "d" };

		String[] ary1 = Arrays.copyOf(org, 2);
		System.out.println( Arrays.toString( ary1) );

		String[] ary2 = Arrays.copyOfRange(org, 1, 3);
		System.out.println(Arrays.toString(ary2));
	}
}
