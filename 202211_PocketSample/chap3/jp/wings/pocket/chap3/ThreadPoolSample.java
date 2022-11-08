package jp.wings.pocket.chap3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// タスクの定義（Callableインターフェイスの実装）
class MyCallable implements Callable<String> {
	@Override
	public String call() throws Exception { // 文字列型を返す
		Thread.sleep(2000); // 2秒待機
		// スレッド名を返す
		return Thread.currentThread().getName();
	}
}

public class ThreadPoolSample {

	public static void sample1() {
		// スレッドを1つ生成する
		ExecutorService exec = Executors.newSingleThreadExecutor();
		// スレッドにタスクを割り当てる
		Future<String> future = exec.submit(new MyCallable());
		try {
			System.out.println(future.isDone()); // タスクの完了状態を表示する
			System.out.println(future.get()); // タスクの結果を表示する
			System.out.println(future.isDone()); // タスクの完了状態を表示する
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			// タスクの 終了指示
			exec.shutdown();
			try {
				// タスクの終了待ち
				exec.awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				// 全タスクの強制終了
				exec.shutdownNow();
			}
		}
	}

	public static void sample2() {
		// スレッドを3つ生成する
		ExecutorService exec = Executors.newFixedThreadPool(3);
		// タスクの結果を保持するリストを生成する
		List<Future<Long>> list = new ArrayList<>();
		try {
			// スレッドにタスクを10個割り当て、結果をリストに追加する
			for (int i = 0; i < 10; i++) {
				list.add(exec.submit(() -> {
					Thread.sleep(2000);
					return Thread.currentThread().getId();
				}));
			}
			// リストからタスクの結果を表示する
			for (Future<Long> future : list) {
				try {
					System.out.println(future.get());
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			}
		} finally {
			// タスクの 終了指示
			exec.shutdown();
			try {
				// タスクの終了待ち
				exec.awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				// 全タスクの強制終了
				exec.shutdownNow();
			}
		}
	}

	public static void main(String[] args) {
		sample1();
//		sample2();
	}

}
