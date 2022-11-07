package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// リストの内容を、前から順に表示し削除する
public class NextIterator{
	public static  void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("morning");
		list.add("noon");

		for(Iterator<String> iterator = list.iterator(); iterator.hasNext();){
			System.out.println(iterator.next());
		}
		// Java SE 8のみ
		list.forEach(System.out::println);
	}
}
