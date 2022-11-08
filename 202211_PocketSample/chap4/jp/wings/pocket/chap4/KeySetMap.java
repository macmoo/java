package jp.wings.pocket.chap4;

import java.util.HashMap;
import java.util.Map;

// マップから、キー、値、両方を保持したセットを取得
public class KeySetMap{
	public static void main(String[] args){
		Map<String,String> map = new HashMap<>();
		map.put("key1", "りんご");
		map.put("key2", "なし");
		map.put("key3", "みかん");

		System.out.println("All:" + map.entrySet());    // 全要素
		System.out.println("Keys:" + map.keySet());     // キーのみ
		System.out.println("Values:" + map.values());   // 値のみ

	}
}
