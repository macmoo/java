package jp.wings.pocket.chap2;

import java.util.ArrayList;
import java.util.List;

public class _GenericDiamondSample {

	public static  <E> List<E> MyArrayList(){
	    return new ArrayList<E>();
	}

	public static void main(String[] args) {

		// 明示的な型の指定は不要
		List<String> list1 = MyArrayList();

		//  ジェネリックスのメソッドを使わない場合（JavaSE6まで）
		List<String> list2 = new ArrayList<String> ();

		// Java SE 7以降
		List<String> rank = new ArrayList<> ();

		rank.add("ニュージーランド");
		rank.add("オーストラリア");
		rank.add("南アフリカ共和国");

	    System.out.println(rank.get(1)); // 結果：オーストラリア
	}

}
