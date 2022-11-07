package jp.wings.pocket.chap3;

//Threadクラスを継承して実行内容を定義します。
public class THRunThreadSample extends Thread {
	public static void main(String[] args) {
		
		// 3つのスレッドを生成する
		for (int i = 0; i < 3; i++) {
			// スレッドを生成し、開始させる
			new THRunThreadSample("Thread" + i).start();
		}
	}
	public THRunThreadSample(String name) {
		super(name);
	}
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			// スレッドの名前とループ回数（0～2）を表示する
			System.out.println(getName() + ":" + i);
		}
	}
}
