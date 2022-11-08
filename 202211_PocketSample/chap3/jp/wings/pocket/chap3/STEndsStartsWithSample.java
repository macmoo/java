package jp.wings.pocket.chap3;

// 文字列のプロトコルと拡張子を調べます。
public class STEndsStartsWithSample {
	public static void main(String[] args) {
		String url = "http://localhost/";
		if (url.startsWith("http")) {
			System.out.println("これはHTTPプロトコルです。");
		}
		// http://の後に、localとなるか
		System.out.println( url.startsWith("local","http://".length()) );

		String file = "sample.java";
		if (file.endsWith(".java")) {
			System.out.println("これはJavaソースファイルです。");
		}
	}
}
