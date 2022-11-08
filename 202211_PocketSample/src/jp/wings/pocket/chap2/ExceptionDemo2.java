package jp.wings.pocket.chap2;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		try {
			int a = 5;
			a /= 0;
		}
		catch ( ArithmeticException ex ) {
			System.out.println( ex.getMessage() );
		}
		finally {
			System.out.println( "終了処理" );
		}
	}
}
