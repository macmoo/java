package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Collection;

// コレクションに対して追加
public class CollectionSampleAdd {
	public static void main(String[] args){

		Collection<String> c1 = new ArrayList<>();
		for(int i = 0; i < 3; i++) c1.add( Integer.toString(i) );

		Collection<String> c2 = new ArrayList<>();
		c2.add("one"); c2.add("2");

		System.out.println("c1：" + c1); // 結果：c1：[0, 1, 2]
		System.out.println("c2：" + c2); // 結果：c2：[one, 2]

		c1.addAll(c2); // c1に、c2を追加
		System.out.println("c1 + c2：" + c1);
		// 結果：c1 + c2：[0, 1, 2, one, 2]
	}
}
