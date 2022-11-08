package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.List;

// リストの部分ビューを作成し、それを変更します。
public class SubListList{
	public static void main(String[] args){

		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		Chap4Tool.dispCollection(list, "list");

	    System.out.println("インデックス3の要素を取得:" + list.get(3));

		System.out.println("listの部分ビューを取得");
		List<String> view = list.subList(1, 4);
		Chap4Tool.dispCollection(view, "view");

		//ビューの要素を変更し、ビューとビューの取得元リストを比べる
		System.out.println("ビューの要素を変更");
		view.set(0, "2");
		Chap4Tool.dispCollection(view, "view");
		Chap4Tool.dispCollection(list, "list");
	}

}
