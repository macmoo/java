package jp.wings.pocket.chap3;

import java.io.PrintWriter;
import java.io.StringWriter;

class StackTraceSample {
	public static void main(String[] args) {

		StringWriter s = new StringWriter(); // 文字列バッファストリーム
		try {
			int[] ary = new int[3];
			ary[4] = 1;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			e.printStackTrace(new PrintWriter(s));
		}
		// 改行、タブを削除して表示
		System.out.println(s.toString().replaceAll("\r|\n|\t", ""));
	}
}
