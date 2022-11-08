package jp.wings.pocket.chap5;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RASizeSample {
	public static void main(String[] args) {
		try {
		    File f = new File("chap5/data/raSize.txt");
		    f.delete();

			try (RandomAccessFile file = new RandomAccessFile(f, "rw")){
				file.write("1234567890".getBytes());
				file.seek(0);

				// 5文字読み飛ばす
				file.skipBytes(5);
				System.out.println(file.readLine());

				// サイズを8にする
				file.setLength(8);
				System.out.println("ファイルサイズ: " +file.length());
			}
			// ファイル内容表示
			try (FileReader in = new FileReader(f)){
				while(in.ready()) System.out.printf("%c",in.read());
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
