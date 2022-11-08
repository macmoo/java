package jp.wings.pocket.chap3;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadSample {

	public static void test1() {
		System.out.println("一定周期（3秒間隔で実行）");
		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

		// 3秒間隔でタスクを繰り返す
		scheduler.scheduleAtFixedRate(() -> {
			try {
				Thread.sleep(1000);	// 1秒スリープ
			} catch (Exception e) {
			}
			System.out.println("Current time: " + new Date());
		} , 0, 3, TimeUnit.SECONDS);

		// 10秒後に実行する
		scheduler.schedule(() -> {
			scheduler.shutdown(); // 全タスクの 終了指示
			test2();
		} , 10, TimeUnit.SECONDS);
	}

	public static void test2() {
		System.out.println("一定遅延（3秒後に実行）");
		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

		// タスクの終了後に3秒待って次を実行する
		scheduler.scheduleWithFixedDelay(() -> {
				try {
					Thread.sleep(1000);	// 1秒スリープ
				} catch (Exception e) {
				}
			System.out.println("Current time: " + new Date());
		} , 0, 3, TimeUnit.SECONDS);

		// 10秒後に実行する
		scheduler.schedule(() -> {
			scheduler.shutdown(); // 全タスクの 終了指示
		} , 10, TimeUnit.SECONDS);
	}

	public static void main(String[] args) {
			test1();
	}

}
