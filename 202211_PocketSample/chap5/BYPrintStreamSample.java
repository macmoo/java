package jp.wings.pocket.chap5;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

// byPrint.txtにメッセージを出力します。
public class BYPrintStreamSample {
	public static void main(String[] args) {
		String[] mes = {"おはよう", "こんにちは", "おやすみ"};
		try (
			PrintStream ps =
				new PrintStream(
						new BufferedOutputStream(
								new FileOutputStream("chap5/data/byPrint.txt")))){
			int size = mes.length;
			for(int i = 0; i < size; i++){
				ps.println(mes[i]);
			}
			for(int i = 0; i < size; i++){
				ps.print(mes[i]);
			}
			if(ps.checkError()){
				System.out.println("入出力処理における例外が発生しました。");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
