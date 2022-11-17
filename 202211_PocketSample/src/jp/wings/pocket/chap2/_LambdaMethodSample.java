package jp.wings.pocket.chap2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _LambdaMethodSample {
	static class MultiValue {
		int v;
		MultiValue(String _v){
	            this.v = Integer.parseInt(_v)*2;
	    }
		@Override
		public String toString(){
			return String.valueOf(this.v);
		}
	}
	public static void main(String[] args) {
		List<String> list = Arrays.asList("123", "7", "-2");

		// StringからMultiValueオブジェクトのStreamに変換
		Stream<MultiValue> m = list.stream().map(MultiValue::new); // コンストラクタ参照

		m.forEach(System.out::println);   // メソッド参照
		// m.forEach(s -> System.out.println(s))と同義
	}
}
