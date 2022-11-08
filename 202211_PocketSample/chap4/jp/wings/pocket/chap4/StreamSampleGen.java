package jp.wings.pocket.chap4;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSampleGen {
	public static void main(String[] args) {

		// 乱数のStreamの先頭から3つ表示する
		Stream.generate(Math::random).limit(3).forEach(System.out::println);

		// 1,2...10を合計する
		System.out.println(
				IntStream.iterate(1,n -> n + 1).limit(10).sum()
		);

	}
}
