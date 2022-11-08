package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListIteratorSamplePre {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random(); // リストの値をランダムに生成

		for (int i = 0; i < 3; i++) {
			list.add(random.nextInt(5));
		}
		System.out.println(list);

		// イテレータを最後の位置に設定する
		ListIterator<Integer> iterator = list.listIterator(list.size());
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}

}
