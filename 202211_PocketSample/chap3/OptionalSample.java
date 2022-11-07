package jp.wings.pocket.chap3;

import java.util.Optional;

public class OptionalSample {
	public static void main(String[] args) {
		String value1 = null;
		Integer value2 = new Integer(10);

		Optional<String> a = Optional.ofNullable(value1); // nullの可能性がある値
		Optional<Integer> b = Optional.of(value2); // nullではない値

		System.out.println("aに値があるか：" + a.isPresent());
		System.out.println("bに値があるか：" + b.isPresent());

		// nullなら文字列を設定する
		String str = a.orElse("bの値：");
		/* 次のコードと同じ
		    String str = "";
		    if (value1 == null) {
			    str = "bの値：";
		    }
		*/

		System.out.println(str + b.get());
	}
}
