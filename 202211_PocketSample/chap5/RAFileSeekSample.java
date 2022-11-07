package jp.wings.pocket.chap5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFileSeekSample {
	public static void main(String[] args) {
		try {
		    File f = new File("chap5/data/raPointer.txt");

			try (FileWriter out = new FileWriter(f)){
				out.write("こんにちは秋元さん");
			}
			try (RandomAccessFile file = new RandomAccessFile(f, "rw")){
				file.seek(15);  // 15バイト目に書き込む 
				file.write("山田".getBytes());
			}
			try (FileReader in = new FileReader(f)){
				while(in.ready()) System.out.printf("%c",in.read());
				// 山田さんに変わる
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

