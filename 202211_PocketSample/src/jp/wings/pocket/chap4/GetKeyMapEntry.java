package jp.wings.pocket.chap4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;

// Map.Entryから、マップのキーと値を取得します。
public class GetKeyMapEntry{
	public static <K,V> void main(String[] args){
		Map<String,String> map = new HashMap<>();
		map.put("key1", "りんご");
		map.put("key2", "なし");
		map.put("key3", "みかん");
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<String, String> mapEntry = iterator.next();
			// 全エントリを置き換え
			mapEntry.setValue(mapEntry.getValue()+mapEntry.getKey());
		}
		System.out.println("setValue:" + map); 
	}
}
