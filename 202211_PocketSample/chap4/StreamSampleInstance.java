package jp.wings.pocket.chap4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamSampleInstance {
	public static void main(String[] args) {

		List<String> lists = Arrays.asList("May ", "Jun.", "Jul.");
		Stream<String> stream1 = lists.stream(); 					// 逐次処理ストリーム
		Stream<String> pstream = lists.parallelStream();		 // 並列処理ストリーム

		String[] strs = {"May ", "Jun.", "Jul."};
		Stream<String> stream2 = Arrays.stream(strs);		// 配列から生成
		Stream<String> stream3 = Stream.of(strs);				// 配列から生成

		LongStream stream4 = LongStream.of(1,2,3);			// 数値型のStreamを生成
		double[] d = {1.0, 2.5, 3.2 ,4.6 ,5.3};

		IntStream is = IntStream.range(1, 3);						// 1,2のStreamを生成
		LongStream ｌs = LongStream.rangeClosed(1, 3);		// 1,2,3のStreamを生成

		DoubleStream stream5 = Arrays.stream(d,1,4);			// 範囲{2.5, 3.2, 4.6}を指定してStreamを生成
		stream5.forEach(System.out::println);						// 要素の表示



	}
}
