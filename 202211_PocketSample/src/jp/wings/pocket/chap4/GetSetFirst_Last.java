package jp.wings.pocket.chap4;

import java.util.SortedSet;
import java.util.TreeSet;

//ソートセットの最初と最後の要素を取り出します。
public class GetSetFirst_Last{
	public static void main(String[] args){
		SortedSet<Integer> set = new TreeSet<>();
		for(int i = 0; i < 5; i++){
			set.add(i + 1);
		}
		System.out.println("最初の要素:" + set.first());
		System.out.println("最後の要素:" + set.last());
	}
}
