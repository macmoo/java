package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// イテレータにより、コレクションの中身を取得します。
public class CollectionIterator{
	public static void main(String[] args){

		Collection<Character> collection = new ArrayList<>();

		char[] c = "Hello !".toCharArray();
		for ( char tmp : c ) {
			collection.add( tmp );
		}

		Iterator<?> iterator = collection.iterator();

		// イテレータで要素を順にすべて取り出すときは以下のようにループ処理をする
		while(iterator.hasNext()){
			System.out.print(iterator.next() + ",");
		}
	}
}

