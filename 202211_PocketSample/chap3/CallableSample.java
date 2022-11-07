package jp.wings.pocket.chap3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSample {
	public static void main(String[] args) {

		// 文字列を返すスレッドの実装
		class MyCallable implements Callable<String> {
			@Override
			public String call() throws Exception {
				Thread.sleep(2000);
				// スレッド名を返す
				return Thread.currentThread().getName();
			}
		}
		ExecutorService executor = Executors.newSingleThreadExecutor();
		MyCallable task = new MyCallable();
		Future<String> response = executor.submit(task);
		try {
			System.out.println(response.get());
		} catch (InterruptedException | ExecutionException  e) {
			e.printStackTrace();
		} finally {
			executor.shutdown();
		}
	}

}
