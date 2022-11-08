package jp.wings.pocket.chap3;

//文字列バッファの容量を増やします。
public class SBCapacitySample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		// 初期16+4文字分のバッファが確保される
		System.out.println(sb.capacity());
		sb.ensureCapacity(30);
		// 30と以前の容量の2倍+2を比較し大きい方が採用される
		System.out.println(sb.capacity());
	}
}
