package jp.wings.pocket.chap2;

// Number型かサブクラスのみに制限したクラス
class NumberExtends<T extends Number> {
	T value;
	public void setValue(T val) {
		this.value = val;
	}
	public int intValue() {
		// Number型かそのサブクラスなのでNumber型のメソッドが可能
		return this.value.intValue();
	}
}
public class GenericBoundedSample {
	public static void main(String[] args) {
		NumberExtends<Float> f = new NumberExtends<Float>();
		f.setValue(1.23F);
		System.out.println(f.intValue()); // 結果：1
		// StringはNumber型のサブクラスでないので以下はエラー
		// NumberExtends<String> s = new NumberExtends<String>();
	}
}
