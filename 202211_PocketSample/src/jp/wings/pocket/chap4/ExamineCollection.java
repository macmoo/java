package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Collection;

// コレクション内の要素の状態を調べます。
public class ExamineCollection {
	public static void main(String[] args){

		Collection<String> col1 = new ArrayList<>();
		for (int i = 0; i < 3; i++) col1.add( Integer.toString(i));

		Collection<String> col2 = new ArrayList<>();
		col2.add("one");	col2.add("two");
		col1.addAll(col2); 

		System.out.println("col1:" + col1); // 結果：c1：[0, 1, 2]
		System.out.println("col2:" + col2); // 結果：c1：[0, 1, 2]

		// col2にthreeを含むか？
		System.out.println(col2.contains("three")); // 結果：false
		// col1はcol2を含むか？
		System.out.println(col1.containsAll(col2)); // 結果：true
		// col2は空か？
		System.out.println(col2.isEmpty());            // 結果：false
		// col2とcol1は等しいか？ 
		System.out.println(col2.equals(col1));        // 結果：false

	}
}

