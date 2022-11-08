package jp.wings.pocket.chap5;


import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;

public class BYReadPrimitiveSample {
	public static void main(String[] args) {
		// BYWritePrimitiveSample.java（項目「指定したデータを書き込む」を参照） 
		// で書き込まれたbyMenu.txtの内容を読み取る 
		try (DataInputStream dis = 
				new DataInputStream(new FileInputStream("chap5/data/byMenu.txt"));) {

			int price = 0;
			byte[] item = new byte[13];

			while (true) {
				try {
					price = dis.readInt();
					dis.readChar();
					dis.readFully(item);
					dis.readChar();
				} catch (EOFException e) {
					break;
				}
				System.out.println(new String(item) + "は、\\" + price + "です。");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}