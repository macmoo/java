package jp.wings.pocket.chap3;

public class ValueOfSample {
	public static void main(String[] args) {
		// Boolean型とDouble型のオブジェクトを生成する
		Boolean bl = Boolean.valueOf("true");
		Double db = Double.valueOf("9.13");
		System.out.println(bl.toString()); // 結果:true
		System.out.println(db.toString()); // 結果:9.13

		// 基数を指定してオブジェクトを生成する
		Byte by = Byte.valueOf("3E",16);
		Integer in = Integer.valueOf("10", 8);
		System.out.println(by.toString()); // 結果:62
		System.out.println(in.toString()); // 結果:8

		// データ型からオブジェクトを生成する
		Float fl = Float.valueOf(1.23f);
		Boolean bl2 = Boolean.valueOf(false);
		System.out.println(fl.toString()); // 結果:1.23
		System.out.println(bl2.toString()); // 結果:false

		Double d = 2d;   // オートボクシング
		while (d < 10) {
			d *= 1.5;
		}
		System.out.println(d); // 結果:10.125
	}
}
