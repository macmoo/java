package jp.wings.pocket.chap5;


import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class BYWritePrimitiveSample {
	// メニュー名と価格をそれぞれchar型、int型としてファイルに書き込む
	public static void main(String[] args) {
		int[] prices = { 250, 280, 320 };
		String[] items = { "Blend Coffee ", "Caffe Latte  ", "Hot Chocolate" };

		// BYReadPrimitiveSample.java
		// （「指定したデータを読み取る」項のサンプル）で読み取り可能
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("chap5/data/byMenu.txt"))) {
			int size = prices.length;
			for (int i = 0; i < size; i++) {
				dos.writeInt(prices[i]);
				dos.writeChar('\t');
				dos.writeBytes(items[i]);
				dos.writeChar('\t');
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
