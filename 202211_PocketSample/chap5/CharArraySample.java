

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharArraySample {
	public static void main(String[] args) {
		try (// 標準入力のストリーム
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(ir);
			// 文字配列出力ストリーム
			CharArrayWriter caw = new CharArrayWriter();) {

			System.out.print("Input : ");
			caw.write("[CharArray]" + in.readLine()); // 標準入力の内容を書き出す

			// cawの内容を文字配列とする文字配列入力ストリームの生成
			CharArrayReader car = new CharArrayReader(caw.toCharArray());
			// 文字配列入力ストリームの内容を標準出力に出力
			int data;
			while ((data = car.read()) != -1) {
				System.out.print((char) data);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
