package jp.wings.pocket.chap3;

//文字列バッファの内容の一部分を、文字配列の指定した位置にコピーします。
public class SBGetCharsSample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("panda");
		char[] dst = { 'J', 'a', 'v', 'a', '!' };
		sb.getChars(0, 3, dst, 2);
		for (int i = 0; i < dst.length; i++) {
			System.out.print(dst[i]);
		}
	}
}