package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListIteratorSample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random(); // リストの値をランダムに生成
		for (int i = 0; i < 2; i++) {
			list.add(random.nextInt(5));
		}
		System.out.println(list);

		// イテレータを最後の位置に設定する
		ListIterator<Integer> iterator = list.listIterator(list.size());

		// 要素数＋1回ループする（最後で例外が発生する）
		for (int i = 0; i < list.size() + 1; i++) {
			try {
				System.out.println(iterator.previous());
			} catch (Exception e) {
				e.printStackTrace(); // 要素が空のとき
			}
		}
	}
}
