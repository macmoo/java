package jp.wings.pocket.chap3;

public class STValueOfSample {
	public static void main(String[] args) {

		System.out.println( String.valueOf(123) );
		System.out.println( String.valueOf(12.3) );

		char[] ch = {'あ','い','う'};
		System.out.println( String.valueOf( ch, 0, ch.length ) );
		
	}
}
