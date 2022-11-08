package jp.wings.pocket.chap8;

import java.math.RoundingMode;
import java.text.DecimalFormat;

// 丸め処理を行う
public class NFRoundingSample {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#");

		double a = 1.5D;
		df.setRoundingMode(RoundingMode.UP);
		System.out.println(df.format(a));
		df.setRoundingMode(RoundingMode.DOWN);
		System.out.println(df.format(a));
		df.setRoundingMode(RoundingMode.CEILING);
		System.out.println(df.format(a));
		df.setRoundingMode(RoundingMode.FLOOR);
		System.out.println(df.format(a));
		df.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println(df.format(a));
		df.setRoundingMode(RoundingMode.HALF_DOWN);
		System.out.println(df.format(a));
		df.setRoundingMode(RoundingMode.HALF_EVEN);
		System.out.println(df.format(a));

		try {
			df.setRoundingMode(RoundingMode.UNNECESSARY);
			System.out.println(df.format(a));
		} catch (ArithmeticException e) {
			System.out.println("丸めが必要");
		}

	}

}
