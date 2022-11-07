package jp.wings.pocket.chap4;

import java.util.Arrays;
import java.util.HashSet;

// コレクションに対して削除
public class CollectionSampleRemove {
	public static void main(String[] args){
		HashSet<Integer> a1 =  new HashSet<>(Arrays.asList(3,2,1));
		HashSet<Integer> a2 = new HashSet<>(Arrays.asList(-1,2));
		System.out.println(a1); // 結果：[1, 2, 3]
		System.out.println(a2); // 結果：[-1,2]

		a1.remove(1);               // 1の要素を削除
		System.out.println(a1); // 結果：[2, 3]

		a1.removeAll(a2);         // a2の要素を削除"
		System.out.println(a1); // 結果：[3]

		a1.clear();                   // すべて削除
		System.out.println(a1); // 結果：[]
	}
}
