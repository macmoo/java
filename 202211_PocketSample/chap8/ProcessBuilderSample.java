package jp.wings.pocket.chap8;

public class ProcessBuilderSample {
	public static void main(String[] args) {
		// 引数を指定してコマンドを実行し、終了まで待機
		ProcessBuilder pb = new ProcessBuilder("notepad.exe", "chap8/zipSample1.txt");
		try {
			System.out.println("プロセス起動: " + pb.command());
			// 起動
			Process p = pb.start();
			// 終了待機
			int ret = p.waitFor();
			System.out.println("プロセス終了: " + ret);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
