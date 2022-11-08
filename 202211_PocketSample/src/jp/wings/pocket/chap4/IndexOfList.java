package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class IndexOfList {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		Random random = new Random(); // 検索するリストをランダムに生成
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(4));
		}
		Iterator<?> iterator = list.iterator();
		System.out.print("list:");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.print("\r\n");

		int key = 3; // 検索キー
		int index = list.indexOf(key);
		if (index != -1) {
			System.out.println(key + "が最初に現れるインデックス:" + index);
		}
		index = list.lastIndexOf(key);
		if (index != -1) {
			System.out.println(key + "が最後に現れるインデックス:" + index);
		}
	}
}
