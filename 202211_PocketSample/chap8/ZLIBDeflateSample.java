package jp.wings.pocket.chap8;

import java.util.zip.Deflater;

public class ZLIBDeflateSample{
	public static void main(String[] args){
		// ZLIBライブラリを使用して、圧縮を行います。
		String data = "DATA SAMPLE DATA SAMPLE DATA SAMPLE";
		byte[] byteData = data.getBytes();
		byte[] deflatedData = new byte[256];

		Deflater def = new Deflater();
		def.setInput(byteData);		// 圧縮するデータをバッファにセット
		if(def.needsInput()){
			return;
		}
		def.finish();
		def.deflate(deflatedData);	// 圧縮データをdeflatedDataに格納
		System.out.println("出力データサイズ:" + def.getBytesWritten());
		System.out.println("入力データサイズ:" + def.getBytesRead());
	}
}
