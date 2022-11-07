package jp.wings.pocket.chap4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamSampleCollect {
	public static void main(String[] args) {
		List<String> lists = Arrays.asList("Swallows", "Giants", "Tigers");
		List<Character> rlists = 
				lists.stream().map(s->s.charAt(0))	// 要素から先頭の文字を抜き出す
					.collect(Collectors.toList());			// Listオブジェクトに変換

		for (Character c : rlists) {
			System.out.println(c);
		}

		// Mapオブジェクトに変換
		Map<Character, String> map = 
				lists.stream()	
					.collect(Collectors.toMap(
							s->s.charAt(0),									// 先頭の文字をキーにする
							s -> { return s.toLowerCase(); }	// 小文字に変換してmapの要素にする
					)
				);	

		// mapオブジェクトの表示
		for (Character key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
	}
}
