package jp.wings.pocket.chap8;

import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class ZLIBInflateSample {
	public static void main(String[] args) {
		// ZLIBライブラリを使用して、解凍を行います。
		String data = "DATA SAMPLE DATA SAMPLE DATA SAMPLE";
		byte[] byteData = data.getBytes();
		byte[] deflatedData = new byte[256];

		try {
			Deflater def = new Deflater();
			def.setInput(byteData);
			def.finish();
			def.deflate(deflatedData); // 圧縮データをdeflatedDataに格納

			// 解凍するデータをバッファに登録
			Inflater inf = new Inflater();
			inf.setInput(deflatedData);

			byte[] inflatedData = new byte[256];
			// 解凍したデータをinflatedDataに格納
			inf.inflate(inflatedData);
			System.out.println(new String(inflatedData));
			// 結果：DATA SAMPLE DATA SAMPLE DATA SAMPLE
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
