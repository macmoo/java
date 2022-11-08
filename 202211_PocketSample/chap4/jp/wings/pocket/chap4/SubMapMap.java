package jp.wings.pocket.chap4;

import java.util.SortedMap;
import java.util.TreeMap;

public class SubMapMap{
	public static void main(String[] args){
		SortedMap<String,String> map = new TreeMap<>();
		map.put("key1", "りんご");
		map.put("key2", "なし");
		map.put("key3", "みかん");
		map.put("key4", "バナナ");
		map.put("key5", "トマト");

		// 全要素
		System.out.println("All:" + map); 

		// key2からkey5まで（key5は含まれない）
		System.out.println("sub:" + map.subMap("key2", "key5")); 

		// 先頭からkey3まで（key3は含まれない）
		System.out.println("head:" + map.headMap("key3")); 

		// key3から最後まで
		System.out.println("tail:" + map.tailMap("key3")); 

		// headMapのビューから削除
		(map.headMap("key3")).remove(map.firstKey());

		// 本体も反映される
		System.out.println("All:" + map); 
	}

}
