package jp.wings.pocket.chap4;

import java.util.Arrays;
import java.util.List;

public class AsListSample {
	public static void main(String[] args) {

		String[] str = { "one", "two", "three" };
		List<String> list = Arrays.asList(str);

		// リストを変更する
		list.set(1, "2");

		// 配列にも反映される
		System.out.println(list);
		System.out.println(str[0] + str[1] + str[2]);

		List<Integer> list2 = Arrays.asList(1, 2, 3);
		System.out.println(list2);

	}
}
