package jp.wings.pocket.chap4;

import java.util.Arrays;

public class CopyArySample {
	public static void main(String[] args){

		String[] org = { "a", "b", "c", "d" };

		String[] ary1 = Arrays.copyOf(org, 2);
		System.out.println( Arrays.toString( ary1) );

		String[] ary2 = Arrays.copyOf(org, 5, String[].class);
		System.out.println(Arrays.toString(ary2));
	}
}
