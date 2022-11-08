package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSampleConcat {
	public static void main(String[] args) {

		List<String> lists = Arrays.asList("May", "Jun.", "Jul.");
		Stream<String> stream1 = lists.stream(); // ストリーム生成

		stream1.filter(v -> v.indexOf(".") > 0)	 // 「.」が含まれるものだけを抽出
				.forEach(System.out::println); 		// 要素の表示

		Stream<String> s1 = Stream.of("12", "abc", "AA");
		// 自然順序でソート
		s1.sorted().forEach(System.out::print);
		System.out.println();
		Stream<String> s2 = Stream.of("12", "abc", "AA");
		// 自然順序の逆でソート
		s2.sorted(Comparator.reverseOrder()).forEach(System.out::print);
		System.out.println();

		// 最大：May
		System.out.println(lists.stream().max(Comparator.naturalOrder()).get());
		// 最小：Jul.
		System.out.println(lists.stream().min(Comparator.naturalOrder()).get());

		int[] ary = {1, 2, 3 };
		// 値を2倍に変換する
		Arrays.stream(ary).map(n -> n*2).forEach(System.out::println);

		int[][] ary2 = {{1, 2, 3},  {4,5},  {5, 6,7,8}};
		Arrays.stream(ary2).flatMapToInt(
				// 要素の配列をIntStreamに変換し各要素を2倍にする
				s -> { return Arrays.stream(s).map(n -> n*2);}
				).forEach(System.out::print);

		System.out.println();

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(num);

		// ListをStreamに変換し各要素2乗した後Listに変換する
		List<Integer> sqr = num.stream().map(n -> n*n).collect(Collectors.toList());
		System.out.println(sqr);

		double[] d = { 1.0, 2.5, 3.2, 4.6, 5.3 };
		System.out.println(Arrays.stream(d).count()); 		// 要素数：5
		List<Double> r = new ArrayList<>();
		r.add(Arrays.stream(d).sum()); 								// 合計
		r.add(Arrays.stream(d).average().getAsDouble()); 	// 平均
		r.add(Arrays.stream(d).min().getAsDouble()); 			// 最小
		r.add(Arrays.stream(d).max().getAsDouble()); 			// 最大
		System.out.println(r);
		// 結果：[16.6, 3.3200000000000003, 1.0, 5.3]
		
		Stream<String> a = Stream.of("May", "Jun.", "Jul.");
		Stream<String> b = Stream.of("5", "6", "7");
		Stream.concat(a, b).forEach(System.out::println); // 結合した結果を表示

		int[] ary_num = {1, -2, 3 };
		// メソッド参照による表示
		Arrays.stream(ary_num).sorted().forEach(System.out::println);

		List<String> list_str = new ArrayList<>();
		list_str.add("い");
		list_str.add("ろ");
		list_str.add("は");

		// ラムダ式による表示
		list_str.forEach(str -> System.out.println(str));

		List<String> list = Arrays.asList("Apple", "Orange", "Apricot");

		// ラムダ式による関数型インターフェースの実装
		Predicate<String> predicate = s -> s.startsWith("A");

		// Aで始まる文字列をカウントする
		long n = list.stream().filter(predicate).count();
		System.out.println(n);
		
	}
}
