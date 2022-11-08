package jp.wings.pocket.chap8;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class InflateZIPFile {
	public static void main(String[] args) {
		// chap8ディレクトリにあるinfZipSample.zipを解凍
		try ( // infZipSample.zip内にあるファイルを解凍する
				FileInputStream fin = new FileInputStream("chap8/infZipSample.zip");
				ZipInputStream zin = new ZipInputStream(fin);) {

			// ZIP入力ストリームにあるエントリごとにファイルを作成し、内容を書き込む
			for (ZipEntry entry;  (entry = zin.getNextEntry()) != null; ) {
				System.out.println("解凍ファイル:" + entry.getName());
				try (FileOutputStream fout = new FileOutputStream(entry.getName());
						BufferedOutputStream bout = new BufferedOutputStream(fout);) {
					byte[] buf = new byte[128];
					for (int size; (size = zin.read(buf, 0, buf.length)) != -1; ) {
						bout.write(buf, 0, size);
					}
					System.out.println("解凍終了");
					zin.closeEntry();
					bout.flush();
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
