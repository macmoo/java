package jp.wings.pocket.chap2;

interface Intf1 {
	default void do1() { // デフォルトメソッド
		System.out.println("do1");
	}
}
interface Intf2 {
	default void do2() { // デフォルトメソッド
		System.out.println("do2");
	}
}
interface Intf3 {
	static void do3() { // 静的メソッド
		System.out.println("do3");
	}
}

//  複数のインターフェイスの実装
class DefaultInterface implements Intf1, Intf2 {
	public static void main(String[] args) {
		DefaultInterface df = new DefaultInterface();
		df.do1();
		df.do2();
		Intf3.do3();	// 静的メソッドの実行
	}
}