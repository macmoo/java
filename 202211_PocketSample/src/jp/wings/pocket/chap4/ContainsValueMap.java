package jp.wings.pocket.chap4;

import java.util.HashMap;
import java.util.Map;

// マップのキーと値それぞれに対し、ある値が含まれているかどうか判定します。
public class ContainsValueMap{
	public static void main(String[] args){
		Map<String,String> map = new HashMap<>();
		map.put("key1", "りんご");
		map.put("key2", "なし");
		map.put("key3", "みかん");
		System.out.println("mapが値として「みかん」を含んでいるか:" + map.containsValue("みかん"));
		System.out.println("mapがキーとして「key4」を含んでいるか:" + map.containsKey("key4"));
	}
}

