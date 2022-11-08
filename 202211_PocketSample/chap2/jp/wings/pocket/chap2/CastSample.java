package jp.wings.pocket.chap2;

public class CastSample {

	public static void main(String[] args) {
		float x = 1f;
		long  y = 2;
		int   z = 3;

		y = z;        // long型←int型の拡張変換
		x = y;        // float型←long型の拡張変換

		System.out.println( x );
		System.out.println( y );

		int   a = 123;
		long  b = a;
//		short c = a;         // コンパイルエラー
		short d = (short)a;  // キャストすればOK

		System.out.println( a );
		System.out.println( b );
		System.out.println( d );

	}

}
