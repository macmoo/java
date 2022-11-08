

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileSample {
	public static void main(String[] args) {
		try{
			File f = new File("chap5/data/raPointer.txt");
			// 10バイト目にint値を書き込む
			try (RandomAccessFile file1 = new RandomAccessFile(f, "rw");){
				file1.seek(10);
				file1.writeInt(1234);
			}
		    // 10バイト目のint値を読み込む
			try (RandomAccessFile file2 = new RandomAccessFile(f, "r")){
				file2.seek(10);
				System.out.println( file2.readInt() ); // 結果：1234
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

