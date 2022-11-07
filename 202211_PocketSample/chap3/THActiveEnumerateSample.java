package jp.wings.pocket.chap3;

public class THActiveEnumerateSample extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep((int) (Math.random() * 1000));
		} catch (InterruptedException e) { }
	}
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			new THActiveEnumerateSample().start();
		}
		// アクティブなスレッド数だけ要素を持つ配列の生成
		Thread[] tarry = new Thread[Thread.activeCount()];

		// アクティブなスレッドを配列にコピー
		Thread.enumerate(tarry);
		for (Thread tmp : tarry )
			System.out.print(tmp.getName() + " ");
	}
}
