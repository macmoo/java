package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableSample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

		// 変更不可なビューを作成
		List<Integer> unmodifiable = Collections.unmodifiableList(list);
		try {
			// 追加すると例外が発生する
			unmodifiable.add(1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
