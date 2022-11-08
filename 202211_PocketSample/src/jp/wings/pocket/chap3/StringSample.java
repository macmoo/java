package jp.wings.pocket.chap3;

public class StringSample {

	public static void main(String[] args) {

		char ary[] = {'j','a','v','a'};	// これは
		String str = new String( ary );	// String str = "java" と同じ
		System.out.println( str );

		String str2 = new String( ary, 1, 2 );
		System.out.println( str2 );
	}

}
