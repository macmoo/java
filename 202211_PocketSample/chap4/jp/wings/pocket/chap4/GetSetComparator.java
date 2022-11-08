package jp.wings.pocket.chap4;

import java.text.Collator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

// 比較子にCollatorを設定し、それを取得します。
public class GetSetComparator{
	public static void main(String[] args){
		// Collatorはロケールに依存する文字列を比較するコンパレータ
		Collator collator = Collator.getInstance();
		SortedSet<String> set = new TreeSet<>(collator);
		set.add("田中");
		set.add("斉藤");
		set.add("高橋");
		Iterator<?> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("コンパレータ:" + set.comparator());
	}
}
