package jp.wings.pocket.chap4;


import java.util.Arrays;
import java.util.LinkedList;


public class RemoveList{
	public static void main(String[] args){
		LinkedList<String> list =
			new LinkedList<>(Arrays.asList("one","two","three"));
		System.out.println("list:" + list);
		System.out.println("インデックス2の要素を削除");
		list.remove(2);
		System.out.println("list:" + list);
	}
}
