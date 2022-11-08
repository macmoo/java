package jp.wings.pocket.chap2;

public class BlockSample {
	public static void main(String[] args) {
		int i = 5;
		if (i == 5) {
			int x = 5;
		}
		{
			// 変数iは、mainメソッド内で有効のため宣言できない
			// int i = 10; 
			int x = 10;
			System.out.println(x); // 結果：10
		}
	}
}
