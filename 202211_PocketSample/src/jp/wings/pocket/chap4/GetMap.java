package jp.wings.pocket.chap4;

import java.util.HashMap;
import java.util.Map;

// getメソッドにより、マッピングの値を取得します。
public class GetMap{
	public static void main(String[] args){
		Map<String,String> map = new HashMap<>();

		map.put("key1", "林檎");
		map.put("key2", "梨");
		map.put("key3", "葡萄");
		System.out.println("key2の値を取得:" + map.get("key2"));
		System.out.println(map.getOrDefault("key4", "桃")); // 結果：桃
	}
}
