package jp.wings.pocket.chap3;

//文字列バッファを検索し、指定した文字を設定します
public class SBIndexOfSample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("あいうかきくあいう");

		System.out.println( sb.indexOf("う") );
		System.out.println( sb.indexOf("う",5) );
		System.out.println( sb.lastIndexOf("う") );
		System.out.println( sb.charAt(sb.lastIndexOf("う")) );
	}
}

