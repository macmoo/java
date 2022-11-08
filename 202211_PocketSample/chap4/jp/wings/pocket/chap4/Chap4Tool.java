package jp.wings.pocket.chap4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class Chap4Tool {
	// コレクション内の要素をすべて表示するメソッド
	public static <E> void dispCollection(Collection<E> c, String colName){
		System.out.print(colName + ": ");
		for( E tmp : c) System.out.print(tmp + " ");
		System.out.println(); System.out.println();
	}
	// マップに含まれるキーと値の組をすべて出力するメソッド
	static void dispMap(Map<?,?> map, String mapName){
		System.out.print(mapName + ":");
		Collection<?> value = map.values();
		Iterator<?> iterator = value.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

}
