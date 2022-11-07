package jp.wings.pocket.chap3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockSample {

	// 排他制御したいクラス例
	public static class Test {
		int count = 0;
		public void something() {
			count++; 		// countを+1して表示する
			System.out.print(count);
		}
	}
	// ロックを取得したスレッドで実行する
	public static void with_lock() {
		Lock lock = new ReentrantLock(); // synchronizedと同様
		Test test = new Test();			// 排他制御したいオブジェクト
		// 同時実行するスレッドを3つ生成する
		ExecutorService exec = Executors.newFixedThreadPool(3);
		try {
			// somethingメソッドを実行するタスクを10回割り当てる
			for (int i = 0; i < 10; i++) {
				exec.submit(
						// Runnableインターフェイスのラムダ式による実装
						() -> { try {
									lock.lock();						// ロック
									test.something();
									lock.unlock();					// ロックの解放
								  } catch (Exception e) {  }
							   } );
			}
		} finally {
			exec.shutdown(); // タスクの 終了指示
			try {
				// タスクの完了を最大5秒待つ
				exec.awaitTermination(5,TimeUnit.SECONDS );
			} catch (InterruptedException e) {
			}
		}
	}
	public static void main(String[] args) {
		with_lock();	// 排他制御され値が順番に+1される
	}
}
