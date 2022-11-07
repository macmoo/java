package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Collection;

// コレクション内の要素の状態を調べます。
public class ExamineCollectionSample {
	public static void main(String[] args){

		Collection<String> col1 = new ArrayList<String>();
		col1.add( "1" );

		Collection<String> col2 = new ArrayList<String>();
		col2.add("1");
		col2.add("2");

		System.out.println("col1とcol2は等しいか？:" + col2.equals(col1));
		col2.remove("2");
		System.out.println("col1とcol2は等しいか？:" + col2.equals(col1));

	}
}

