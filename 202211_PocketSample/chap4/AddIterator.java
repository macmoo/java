package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//イテレータから、リストに要素を追加／設定／削除します。
public class AddIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("noon"); list.add("evening");
		System.out.println(list); // 結果；[noon, evening]

		ListIterator<String> iterator = list.listIterator();
		iterator.add("morning"); // リストに morning を加える
		System.out.println(list); // 結果；[morning, noon, evening]

		iterator.next();
		iterator.set("afternoon"); // noonをafternoon に変える
		System.out.println(list); // 結果；[morning, afternoon, evening]

	}
}
