package jp.wings.pocket.chap3;

//スレッドの名前と優先順位を設定／取得します。
public class THSetGetInfoSample extends Thread {
	public static void main(String[] args) {
		Thread th = new THSetGetInfoSample("MyThread");
		// 最優先順位を割り当てる
		th.setPriority(MAX_PRIORITY);
		th.start();
	}
	public THSetGetInfoSample(String name) {
		super(name);
	}
	public void run() {
		// 初期状態のスレッド名を出力
		System.out.println(getName());
		// スレッド名を設定し直し再び出力
		Thread.currentThread().setName("YourThread");
		System.out.println(getName());
		// 優先順位の出力
		System.out.println(getPriority());
	}
}
