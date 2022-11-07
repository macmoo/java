package jp.wings.pocket.chap2;

public class BreakSample {

	public static void main(String[] args) {
		
        for ( int i = 0 ; true ; i++ )
        {
            if ( i == 3 )
            {
                break; // ここでループを中断
            }
            System.out.println( i );
        }

	}

}
