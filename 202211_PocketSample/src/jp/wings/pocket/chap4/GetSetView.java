package jp.wings.pocket.chap4;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

//セットのビューに値を追加することでセットに値を追加
public class GetSetView{
	public static void main(String[] args){
		SortedSet<Integer> set = new TreeSet<>();
		for(int i = 0; i < 5; i++){
			set.add(i + 1);
		}
		SortedSet<Integer> view = set.headSet(3);
		Iterator<?> iterator = view.iterator();
		System.out.println("ビューの要素");

		while(iterator.hasNext()){
			System.out.println("setのビュー:" + iterator.next());
		}

		System.out.println("ビューに値0を追加");
		view.add(new Integer(0));
		System.out.println("セットの要素");
		//ビューへの変更がセットに反映されているか確認
		iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println("set:" + iterator.next().toString());
		}
	}
}
