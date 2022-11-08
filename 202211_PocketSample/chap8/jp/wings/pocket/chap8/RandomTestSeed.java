package jp.wings.pocket.chap8;

import java.util.Random;

public class RandomTestSeed {

	// 5つのバイト値を表示
	public static void printnum(Random r) {
		byte[] ba = new byte[5];
		r.nextBytes(ba);
		for ( byte b : ba ) {
			System.out.print(b +" ");
		}
		System.out.println();
	}

	// シード値を設定して乱数を表示
	public static void main(String s[]) {
		// 各種の乱数を表示
		printnum(new Random());

		Random r = new Random(10);
		printnum(r);
		r.setSeed(10);
		printnum(r); // 上と同じ値となる
	}
}
