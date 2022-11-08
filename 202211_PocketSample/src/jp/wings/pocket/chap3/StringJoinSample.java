package jp.wings.pocket.chap3;

import java.util.Arrays;
import java.util.List;

public class StringJoinSample {
	 public static void main(String[] args) {
		 // カンマ区切り文字列にする
		 String str1 = String.join(",", "あ","い","う");
		 System.out.println(str1); // 結果：あ,い,う

		 // 区切り文字なしの場合
		 List<String> list = Arrays.asList("a","b","c");
		 String str2 = String.join("",list);
		 System.out.println(str2); // 結果：abc
	 }
}
