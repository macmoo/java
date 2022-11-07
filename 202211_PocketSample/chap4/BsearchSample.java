package jp.wings.pocket.chap4;

import java.util.Arrays;
import java.util.Random;

public class BsearchSample {
	public static void main(String[] args) {

		int[] ary = new int[10];
		Random random = new Random();

		// 1～9の値を持つ配列を作成
		for (int i = 0; i < ary.length; i++) {
			ary[i] = random.nextInt(9) + 1;
		}
		// 昇順でソートする
		Arrays.sort(ary);

		// 配列の要素を表示する（ストリームを利用）
		Arrays.stream(ary).forEach(System.out::print);
		System.out.println();

		// 5を検索する
		System.out.println(Arrays.binarySearch(ary, 5));

		// -1を検索する
		System.out.println(Arrays.binarySearch(ary, -1));
		// 配列のすべての要素が検索キーより大きいため、
		// 挿入ポイントは、0になる。 -1 = -（0）-1

		// 10を検索する
		System.out.println(Arrays.binarySearch(ary, 10));
		// 配列のすべての要素が検索キーより小さいため、
		// 挿入ポイントは、配列の長さの10になる。 -11 = -（10）-1
	}
}
