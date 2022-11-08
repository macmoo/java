package jp.wings.pocket.chap5;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

// さまざまな型のデータを、標準出力に出力します。
public class CHPrintSample {
	public static void main(String[] args) {
		try (OutputStreamWriter os = new OutputStreamWriter(System.out)) {
			PrintWriter out = new PrintWriter(new BufferedWriter(os));
			out.print("boolean:" + true);
			out.print(" char:" + 'a');
			out.print(" int:" + 1);
			out.print(" double:" + 0.1);
			out.println(" 改行");
			out.print("String:" + "string");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
