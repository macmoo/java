package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// リストの内容を、前から順に表示し削除する
public class NextIteratorNext{
	public static  void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("morning");
		list.add("noon");
		list.add("evening");

		Iterator<String> iterator = list.iterator();
		while( iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
