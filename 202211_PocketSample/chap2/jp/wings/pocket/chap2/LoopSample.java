package jp.wings.pocket.chap2;
import java.util.stream.IntStream;

public class LoopSample {
	public static void main(String[] args) {
		for ( int i = 0; i < 3; i++ )
		{
		    System.out.print( i );
		}

		IntStream.range(0, 3).forEach(System.out::print);
	}

}
