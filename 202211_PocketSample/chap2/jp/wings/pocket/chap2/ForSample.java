package jp.wings.pocket.chap2;

import java.util.Arrays;

public class ForSample {

	public static void main(String[] args) {

		int data[] = {10, 15, 20};

		for (int val: data){
		    System.out.println( val );
		}

		Arrays.stream(data).forEach(System.out::println);
	}

}
