package jp.wings.pocket.chap4;


import java.util.Arrays;
import java.util.LinkedList;

// LinkedListオブジェクトに要素を追加
public class AddList{
	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<>();
		list.add("あ");
		list.add("う");
		list.add(1,"い");
		list.addAll(Arrays.asList("え","お"));
		list.addAll(0,Arrays.asList("ひ","ら","が","な"));
		System.out.println(list);
	}
}
