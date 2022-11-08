package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Arrays;


// 指定以外の全要素を削除
public class CollectionSampleRetain {
	public static void main(String[] args){

		ArrayList<String> col1 = new ArrayList<>(Arrays.asList("A","B","C"));
		ArrayList<String> col2 = new ArrayList<>(Arrays.asList("AA","B","CC"));

		col1.retainAll(col2);
		System.out.println(col1);
	}
}
