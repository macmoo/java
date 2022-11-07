package jp.wings.pocket.chap5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.Date;

// cnFile.txtのファイルサイズを小さくして、内容をカット
public class CNFileOpeSample {
	public static void main(String[] args) {
		try {
			File f= new File("chap5/data/cnFile.txt");
			try (BufferedWriter tmp = new BufferedWriter(new FileWriter(f))){
				String str = new Date().toString();
				System.out.println(str);
				tmp.write(str);
			}

			// ファイルチャネルの生成
			try (RandomAccessFile raf = new RandomAccessFile(f, "rw");
				 FileChannel fc = raf.getChannel()){
				fc.truncate(fc.size()-10); // ファイルの切り詰め
			}
			
			try (FileReader in = new FileReader(f)){
				while(in.ready()) System.out.printf("%c",in.read());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
