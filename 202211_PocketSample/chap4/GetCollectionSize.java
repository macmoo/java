package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Collection;

// コレクションのサイズを取得します。
public class GetCollectionSize {

	public static void main(String[] args) {
		Collection<Integer> col = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			col.add(i);
		}
		System.out.println("colのサイズ:" + col.size());

		for (int i = 0; i < 5; i++) {
			col.add(i);
		}
		System.out.println("colのサイズ:" + col.size());


	}


}
