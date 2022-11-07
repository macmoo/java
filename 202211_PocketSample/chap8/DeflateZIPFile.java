package jp.wings.pocket.chap8;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class DeflateZIPFile {
	// chap8ディレクトリにあるzipSample1.txtを、ZIPファイルに圧縮
	public static void main(String[] args) {
		String deflateFile = "chap8/zipSample1.txt";
		try (FileOutputStream fout = new FileOutputStream("chap8/defZipSample.zip");
				// ZIPデータの出力先をファイル出力ストリームを用いて指定
				ZipOutputStream zout = new ZipOutputStream(fout);
				FileInputStream fin = new FileInputStream(deflateFile);
				BufferedInputStream bin = new BufferedInputStream(fin);) {

			// zipSample1.txtをZIPファイルのエントリに登録
			ZipEntry entry = new ZipEntry(deflateFile);
			zout.putNextEntry(entry);

			// bufにzipSample.txtの内容を読み込み、それをZIPファイルに書き込む
			byte[] buf = new byte[128];
			for (int size; (size = bin.read(buf, 0, buf.length)) != -1;) {
				zout.write(buf, 0, size);
			}
			System.out.println("書き込み終了");
			zout.closeEntry();	 // エントリのクローズ
			zout.flush(); 				 // フラッシュしておく
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}