package jp.wings.pocket.chap5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// smile.gifを読み込み、コピーであるnewImage.gifを生成します。
public class FileOutputSample {
	public static void main(String[] args) throws IOException {
		try (FileInputStream in = 
				new FileInputStream("chap5/data/smile.gif");
			 FileOutputStream out = 
				new FileOutputStream("chap5/data/newImage.gif")) {
			int data;
			while ((data = in.read()) != -1) {
				out.write((byte) data);
			}
		}
	}
}
