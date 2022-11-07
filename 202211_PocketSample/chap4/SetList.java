package jp.wings.pocket.chap4;


import java.util.Arrays;
import java.util.LinkedList;


public class SetList{
	public static void main(String[] args){
		LinkedList<String> list =
			new LinkedList<>(Arrays.asList("one","two","three"));
		list.set(0, "1");
		list.set(2, "3");
		System.out.println("list:" + list);
	}
}
