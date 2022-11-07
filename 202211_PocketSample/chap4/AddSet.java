package jp.wings.pocket.chap4;

import java.util.HashSet;
import java.util.Set;

// セットに要素とコレクションを追加
public class AddSet{
	public static void main(String[] args){

		Set<String> set1 = new HashSet<>();
		set1.add("ONE"); set1.add("TWO");

		Set<String> set2 = new HashSet<>();
		for(int i = 0; i < 5; i++){ set2.add(Integer.toString(i)); }

		System.out.println(set1.add("ONE")); //結果:false
		System.out.println(set1.add("2"));   //結果:true

		// set1にset2を追加
		set1.addAll(set2);
		Chap4Tool.dispCollection(set1, "set1");//結果:set1: 3 2 1 0 ONE 4 TWO
		Chap4Tool.dispCollection(set2, "set2");//結果:set2: 3 2 1 0 4
	}
}
