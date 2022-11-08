package jp.wings.pocket.chap2;

public class ContinueSample {

	public static void main(String[] args) {

		for ( int i = 0 ; ; i++ )
		{
			if ( i < 8 )
			{
				continue; // （i++の後に）ループの先頭に戻る
			}
			else if ( i == 10 )
			{
				break; // ループ中断
			}
			System.out.println( i );
		}
	}
}
