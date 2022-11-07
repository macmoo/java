package jp.wings.pocket.chap4;

import java.util.Arrays;
import java.util.List;

public class StreamSampleMatch {
	public static void main(String[] args) {

		List<String> lists = Arrays.asList("gFh", "aLsdb", "adｇｄ");

		System.out.println(
				// すべて小文字の要素があるか
				lists.stream().anyMatch(
						// すべて小文字かを判定（すべて小文字に変換して元の文字列と比較）
						s -> {	return s.equals(s.toLowerCase());	}
				)
		); // 結果：true
		System.out.println(
				// すべて小文字の要素だけか
				lists.stream().allMatch(
						s -> {	return s.equals(s.toLowerCase());	}
				)
		); // 結果：false
		System.out.println(
				// 7以上の長さの要素がないか
				lists.stream().noneMatch(
						s -> {	return 7 <= s.length();	}
				)
		); // 結果：true
	}
}
