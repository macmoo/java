package jp.wings.pocket.chap8;

import java.util.Random;

public class RandomTest {
	public static void main(String s[]) {
		// 各種の乱数を表示
		Random rand = new Random();
		System.out.println(rand.nextFloat());
		System.out.println(rand.nextInt(10)); // 10未満
		byte[] ba = new byte[5];
		rand.nextBytes(ba);
		for ( byte b : ba )
			System.out.print(b+",");
	}
}
