package jp.wings.pocket.chap2;

// スーパークラス
class SuperClass {
	// コンストラクター
	SuperClass() {
		System.out.println("SuperClass コンストラクター");
	}
	// static初期化子
	static {
		System.out.println("SuperClass static初期化子");
	}

	// インスタンス初期化子
	{
		System.out.println("SuperClass インスタンス初期化子");
	}


}

// サブクラス
class SubClass extends SuperClass {
	static {
		System.out.println("SubClass static初期化子");
	}
	{
		System.out.println("SubClass インスタンス初期化子");
	}

	SubClass() {
		System.out.println("SubClass コンストラクター");
	}
}

public class InitializerSample {
	public static void main(String[] args) {
		// 初回のクラス生成
		System.out.println("1回目");
		SubClass c1 = new SubClass();
		// 2回目のクラス生成（static初期化子は呼ばれない）
		System.out.println("2回目");
		SubClass c2 = new SubClass();
	}
}
