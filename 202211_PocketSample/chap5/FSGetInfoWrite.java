

import java.io.File;

public class FSGetInfoWrite {
	public static void main(String[] args) {
		File file = new File("chap5/data/isfile.txt");

		// アクセス権の設定
		System.out.println("書き込み権許可:" + file.setWritable(true,true));
		System.out.println("読み込み権許可:" + file.setReadable(true));
		System.out.println("実行権不許可:" + file.setExecutable(false));
	}
}
