

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Date;

public class CNFileReadWriteSample {
	public static void main(String[] args) {
		try {
			// 15MBほどのファイルを作成します
			File f = new File("chap5/data/cnOri.txt");
			try (BufferedWriter tmp = new BufferedWriter(new FileWriter(f));) {
				for (int i = 0; i < 500000; i++) {
					tmp.write(new Date().toString());
					tmp.newLine();
				}
			}
			long s = new Date().getTime();
			// cnOri.txtの内容をcnCpy.txtにコピー
			try (FileInputStream fis = new FileInputStream(f);
				 FileOutputStream fos = new FileOutputStream("chap5/data/cnCpy.txt")) {
				FileChannel in = fis.getChannel();
				FileChannel out = fos.getChannel();

				ByteBuffer bf = ByteBuffer.allocateDirect((int) in.size());
				bf.clear();
				in.read(bf);
				bf.flip();
				out.write(bf);
			}
			System.out.println(new Date().getTime() - s + "ミリ秒");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
