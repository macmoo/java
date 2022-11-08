package jp.wings.pocket.chap2;

public class InnerSample {

	class Inner1 {
		public void disp() {
			System.out.println("Inner1クラス");
		}
	}

	// staticな内部クラス
	static class StaticInner {
		public void disp() {
			System.out.println("static Innerクラス");
		}
	}

	public void disp() {

		// メソッドローカルな内部クラス
		class Inner2 {

			public void disp() {
				System.out.println("Inner2クラス");
			}
		}
		new Inner2().disp();
	}

	public static void main(String[] args) {

		InnerSample is = new InnerSample();
		is.disp();

		// 内部クラスのインスタンス生成
		InnerSample.Inner1 inner = is.new Inner1();
		inner.disp();

		// InnerSample1の指定は不要
		new StaticInner().disp();
	}

}
