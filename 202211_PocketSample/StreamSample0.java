package jp.wings.pocket;

import java.util.Arrays;
import java.util.List;

public class StreamSample0 {
	public static void main(String[] args) {

		// リストオブジェクト
		List<Integer> list = Arrays.asList(1, 3, 8, 9,10,12);

		// 偶数の個数を数える（Streamを使ったコード）
		long ct = list.stream() 		// 生成処理
				.filter(v -> v % 2 == 0) // 中間処理
				.count(); 						// 終端処理
		System.out.println(ct);

		// 偶数の個数を数える（従来のコード）
		long ct1 = 0;
		for (int v : list) {
			if ((v % 2) == 0) {
				ct1++;
			}
		}
		System.out.println(ct1);
	}
}
