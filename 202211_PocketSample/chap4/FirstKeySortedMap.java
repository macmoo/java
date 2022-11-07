package jp.wings.pocket.chap4;

import java.util.SortedMap;
import java.util.TreeMap;

// ソートマップから、最初と最後のキーを取得します。
public class FirstKeySortedMap{
	public static void main(String[] args){
		SortedMap<String,String> map = new TreeMap<>();
		map.put("key1", "りんご");
		map.put("key2", "なし");
		map.put("key3", "みかん");
		System.out.println("mapの最初のキー:" + map.firstKey());
		System.out.println("mapの最後のキー:" + map.lastKey());
	}
}
