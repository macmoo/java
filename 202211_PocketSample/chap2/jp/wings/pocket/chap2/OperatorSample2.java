package jp.wings.pocket.chap2;

public class OperatorSample2 {

	public static void main(String[] args) {

		int   x = 15;
		long  y = x;
		byte  z = (byte)x;

		x += 2;   // x = x + 2 と同じ
		x *= y;   // x = x * y と同じ

		System.out.println( x );
		System.out.println( y );
		System.out.println( z );

	}

}
