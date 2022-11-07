package jp.wings.pocket.chap2;

class VLengthSample {

	void method(String... args) {   // 可変長引数
		for (String s : args) {     // argsは配列として扱う
			System.out.println(s);
		}
	}

	public static void main(String[] args) {

		VLengthSample v = new VLengthSample();
		v.method("a");
		v.method();
		v.method("a", "b", "c");
	}
}