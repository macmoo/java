package jp.wings.pocket.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EffectivelyFinalSample {

	public static void main(String[] args) {

		// listは実質的なfinal
		List<String> list = new ArrayList<>();

		Stream.of("A", "B", "C", "D", "E").
			forEach(
				s -> { list.add(s.toLowerCase()); }
			);

		// list = new ArrayList<>()のように
		// listに代入するとコンパイルエラーになる

		System.out.println(list);
		// 結果：[a, b, c, d, e]
	}

}
