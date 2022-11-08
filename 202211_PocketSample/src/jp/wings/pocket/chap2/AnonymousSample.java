package jp.wings.pocket.chap2;

interface Idisp {
	  void disp();
}

public class AnonymousSample {
	public static void main(String[] args) {
		// Idisp型オブジェクトの定義と生成
		Idisp obj = new Idisp()  {
			private String msg = "無名クラス";

			public void disp() {
				System.out.println( msg );
			}
		};
		obj.disp();
	}
}
