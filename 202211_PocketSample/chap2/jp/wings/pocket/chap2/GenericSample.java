package jp.wings.pocket.chap2;

// 型引数を使ったクラス定義 
class GenericClass<T> {

	T value; // 型引数によるフィールドの宣言

	// メソッドの引数に使った場合
	public void setValue(T val) {
		T value2 = val; // ローカル変数に使った場合
		this.value = value2;
	}
	// メソッドの戻り値に使った場合
	public T getValue() {
		return this.value;
	}
	// 静的なメソッドやフィールドには使えません
	// public static void getValue2(T val){}
	// static T value2;
}
public class GenericSample {
	public static void main(String[] args) {
		// IntegerクラスのGenericClass 
		GenericClass<Integer>  gc1 = new GenericClass<Integer>();
		gc1.setValue(123);
		System.out.println( gc1.getValue() );

		// StringクラスのGenericClass 
		GenericClass<String>  gc2 = new GenericClass<String>();
		gc2.setValue("文字列");
		System.out.println( gc2.getValue() );

		// 型が異なるのでコンパイルできない 
        // gc2.setValue(123); 
	}
}
