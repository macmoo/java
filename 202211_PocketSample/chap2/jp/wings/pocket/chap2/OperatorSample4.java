package jp.wings.pocket.chap2;

public class OperatorSample4 {

	public static void main(String[] args) {
		int x = 5;
		int y = 2;

		boolean  z = x < y;           // zの初期値はfalseとなる
		boolean  bl = true | false;   // blの初期値はtrueとなる

		System.out.println( z );
		System.out.println( bl );

		int a = 5;
		int b = 2;

		int  c = ( a < b ) ? 1 : 2;   // zの初期値は、x<yがfalseなので、2となる
		System.out.println( c );
	}

}
