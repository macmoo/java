package jp.wings.pocket.chap2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaSample {

	public static void main(String[] args) {
		// Runnableインターフェイスのラムダ式による実装
		Runnable runner1 = () -> {
			List<Integer> list = Arrays.asList(4, 0, 8, 2, -5);

			Collections.sort(list,
					// Comparatorインターフェイスのラムダ式による実装
					(o1, o2) -> {
				return Integer.compare(o1, o2);
			// (o1, o2) -> Integer.compare(o1, o2) でも可
					}
			);
			// メソッド参照
			// Collections.sort(list, Integer::compare);

			// Consumerインターフェイスのラムダ式による実装
			list.forEach(s -> System.out.println(s));
			// メソッド参照
			// list.forEach(System.out::println);
		};

		Thread t1 = new Thread(runner1);
		t1.start();
		try {
			t1.join(); // 子スレッド終了まで待つ
		} catch (InterruptedException e) {
		}
		System.out.println("メインスレッド終了");
	}
}
