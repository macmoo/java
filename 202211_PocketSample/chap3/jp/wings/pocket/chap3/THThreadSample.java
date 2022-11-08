package jp.wings.pocket.chap3;

//一連のスレッド処理を行います。
public class THThreadSample {

	public static void main(String[] args) {

		// 共有オブジェクトの生成
		LockObj obj = new LockObj();

		// スレッドの生成と開始
		new GetThread(obj).start();
		new SetThread(obj).start();
	}
}

// 値を設定するスレッド
class SetThread extends Thread {

	LockObj obj; //共有するオブジェクト

	// コンストラクタ
	SetThread(LockObj obj) {
		this.obj = obj;
	}
	public void run() {
		// 5回繰り返す
		for (int i = 0; i < 5; i++) {
			// 値を設定する
			this.obj.setValue(i);
			System.out.println("SET:" + i);

			// ランダム時間このスレッドを停止させる
			try {
				Thread.sleep( (int)(Math.random() * 1000));
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

// 値を取得するスレッド
class GetThread extends Thread {
	LockObj obj; // 共有するオブジェクト

	// コンストラクタ
	GetThread(LockObj obj) {
		this.obj = obj;
	}
	// 5回繰り返す
	public void run() {
		for (int i = 0; i < 5; i++) {
			// 値を取得する
			System.out.println("GET:" + this.obj.getValue());
		}
	}
}

// スレッドに共有されるオブジェクトのクラス
class LockObj {
	// valueの値が一貫性を持つようにする
	private int value;

	// flagがfalseのときは読み込みが終了している状態
	// trueのときは書き込みが終了している状態
	private boolean flag = false;

	// valueに値を設定する
	public synchronized void setValue(int v) {

		// trueのときは読み込みが終了していないので待機
		while (this.flag == true) {
			try {
				wait();
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}

		// 値を設定
		value = v;

		// 書き込み終了のフラグを立てる
		flag = true;

		// このオブジェクトを取得しようとしているスレッドを再開
		notifyAll();
	}

	// valueから値を取り出す
	public synchronized int getValue() {

		// falseのときは書き込みが終了していないので待機 
		while (flag == false) {
			try {
				wait();
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		// 読み込み終了のフラグを立てる
		flag = false;

		// このオブジェクトを取得しようとしているスレッドを再開
		notifyAll();

		// valueの値を返す
		return value;
	}
}