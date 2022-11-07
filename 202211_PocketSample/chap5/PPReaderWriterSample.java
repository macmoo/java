package jp.wings.pocket.chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PPReaderWriterSample {
	public static void main(String[] args) {
		// 標準入力をパイプを経由して標準出力に出力する 
		try (
			// 標準入力のストリーム
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(ir);
			PipedWriter pw = new PipedWriter();		// 出力パイプの生成
			PipedReader pr = new PipedReader(pw);){	// 入力パイプに出力パイプを連結
			System.out.print("Input : ");
			pw.write("[piped]" + in.readLine());
			
			// 標準出力からの入力を加工して書き込む 
			int data;
			while ((data = pr.read()) != -1) {
				System.out.print((char) data);      // 入力パイプの内容を標準出力に
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
