

import java.io.File;


public class FSDeleteSample {
	public static void main(String[] args) {
		File dir1 = new File("chap5/data/subDir1");
		System.out.println(dir1 + "生成: " + dir1.mkdir());
		dir1.deleteOnExit();
		System.out.println( "存在?: "+dir1.exists() );
		dir1.delete();
		System.out.println(dir1 + "削除: " + dir1.delete());
		System.out.println( "存在?: "+dir1.exists() );
	}
}
