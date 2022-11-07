package jp.wings.pocket.chap8;

import java.util.TreeMap;

public class SYGetSetPropertySample {
	public static void main(String[] args) {
		// システムプロパティをTreeMapにコピー
		TreeMap<?,?> map
			= new TreeMap<Object,Object>(System.getProperties());
		// アルファベット順にキーと値を表示
		for (Object key : map.keySet() ) {
			String val = System.getProperty((String) key);
			System.out.println(key + "=" + val);
	    }
	}
}

