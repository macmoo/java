package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// リストの内容を、前から順に表示し削除する
public class NextIteratorRemove{
	public static  void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("morning");
		list.add("noon");
		list.add("evening");

		for(Iterator<String> iterator = list.iterator(); iterator.hasNext();){
			System.out.println(iterator.next());
			iterator.remove(); // 削除
		}
		// 空か？
		System.out.println("Empty？:"+list.isEmpty());
	}
}
