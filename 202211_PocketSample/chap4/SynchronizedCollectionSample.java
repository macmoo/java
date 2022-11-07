package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Listデータをスレッドそれぞれが削除する
public class SynchronizedCollectionSample extends Thread {

	static int total = 0;
	final List<Integer> deq;

	public SynchronizedCollectionSample(List<Integer> deq) {
		this.deq = deq;
	}

	@Override
	public void run() {
		int count = 0;

		// 要素がなくなるまで先頭データ削除
		while (true) {
			try {
				deq.remove(0);
				count++; // 削除数
			} catch (Exception e) {
				break;
			}
		}
		synchronized (this.getClass()) {
			total += count; // 総削除数に加算
		}
	}

	static void test(List<Integer> l) throws InterruptedException {

		total = 0;
		for (int i = 0; i < 5000; i++)
			l.add(i); // 初期データ設定

		ArrayList<Thread> at = new ArrayList<>();

		// 10スレッド生成
		for (int i = 0; i < 10; i++)
			at.add(new SynchronizedCollectionSample(l));

		for (Thread t : at)
			t.start();
		for (Thread t : at)
			t.join(); // 終了まで待機

		System.out.println("total " + total + " elements");
	}

	public static void main(String args[]) throws Exception {

		System.out.print("normal: ");
		test(new LinkedList<Integer>()); // 実行するたびに数が異なる

		System.out.print("synchronized: ");
		test(Collections.synchronizedList(new LinkedList<Integer>()));
	}
}
