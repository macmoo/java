package jp.wings.pocket.chap4;

import java.util.HashMap;
import java.util.Map;

public class PutMap{
	public static void main(String[] args){

		// map1の初期化
		Map<String,String> map1 = new HashMap<>();
		map1.put("key1", "りんご");
		System.out.println(map1);

		// map2の初期化
		Map<String,String> map2 = new HashMap<>();
		map2.put("key1", "なし");
		map2.put("key2", "みかん");
		System.out.println(map2);

		// map1にmap2を加える
		map1.putAll(map2);
		System.out.println(map1);

		// map1からkey1の値を削除
		map1.remove("key1");
		System.out.println(map1);

		// map1のkey2の値を置換
		map1.replace("key2","バナナ");
		System.out.println(map1);

	}
}
