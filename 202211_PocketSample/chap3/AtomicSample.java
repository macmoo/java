package jp.wings.pocket.chap3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicSample {
	public static void main(String[] args) {
		// 値をアトミックに＋3するクラス
		class AtomicAdd {
			AtomicInteger count = new AtomicInteger();
			// アトミックに加算する
			public void add() { count.addAndGet(3); }
			public int get() { return count.get(); 	}
		}
		AtomicAdd sample = new AtomicAdd();

		// スレッド100個生成し、1000個のタスクを割り当てる
		ExecutorService exec = Executors.newFixedThreadPool(100);
		for (int i = 0; i < 1000; i++) {
			exec.submit(() -> { sample.add(); });
		}
		// タスクの 終了指示
		exec.shutdown();
		try {
			// タスクの終了待ち
			exec.awaitTermination(5, TimeUnit.SECONDS);
		}
		catch (InterruptedException e) {
			exec.shutdownNow();
		}
		// +3を1000回行った結果の表示
		System.out.println(sample.get());	// 結果：3000
        // 単純に+3すると3000にならない場合がある
	}
}
